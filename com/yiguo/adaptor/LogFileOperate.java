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
         * ΪʲôҪ���������� TODO ,�쳣�Ǳߵ�֪ʶ���ܶ� �쳣 catch ������ �ǳ��ң�
         * �׳����쳣�ܶ࣬ �ɲ����Զ��쳣����ͳһ�Ĺ���
         */
        File file = new File(filePathName);
        // �ж�һ���ļ��Ƿ���ڣ����������жϣ�File��new�������϶�������null��
        // if (file != null){
        // System.out.println("file exists");
        // } else {
        // System.out.println("file not exists");
        // }
        if (file.exists()) {
            try {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                try {
                    // TODO Ϊʲô��ʾ ���Ͳ���ȫ��
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
