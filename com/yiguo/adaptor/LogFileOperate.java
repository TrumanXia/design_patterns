package com.yiguo.adaptor;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class LogFileOperate implements LogFileOperateApi
{

    private String filePathName = "adaptorLog.log";

    public LogFileOperate() {

    }

    public LogFileOperate(String filePathName) {

        if (filePathName != null && filePathName.trim().length() > 0) {
            this.filePathName = filePathName;
        }
    }

    @Override
    public List<LogModel> readLogFile() {

        List<LogModel> list = null;
        ObjectInputStream oin = null;

        /**
         * 为什么要这样处理流 TODO ,异常那边的知识，很多 异常 catch ，代码 非常乱！
         * 抛出的异常很多， 可不可以对异常进行统一的管理
         */
        File file = new File(filePathName);
        // 判断一个文件是否存在，不能这样判断，File刚new出来，肯定不等于null。
        // if (file != null){
        // System.out.println("file exists");
        // } else {
        // System.out.println("file not exists");
        // }
        if (file.exists()) {
            try {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                try {
                    // TODO 为什么提示 类型不安全？
                    list = (List<LogModel>) oin.readObject();
                }
                catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                if (oin != null) {
                    try {
                        oin.close();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {

        File file = new File(filePathName);
        ObjectOutputStream objectOutputStream = null;

        try {
            objectOutputStream = new ObjectOutputStream(
                                                        new BufferedOutputStream(
                                                                new FileOutputStream(file)));
             objectOutputStream.writeObject(list);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (objectOutputStream != null){
                try {
                    objectOutputStream.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
