package com.yiguo.adaptor;

import java.util.ArrayList;
import java.util.List;

public class Client
{

    public static void main(String[] args) {

//        new LogFileOperate ().readLogFile();
        LogModel log = new LogModel();
//        TODO �о� �� ���� ��� ��������
        log.setLogId("1");
        log.setOperateTime("2018��1��14��21:37:15");
        log.setOperateUser("truman");
        log.setLogContent("domain");
        
        List<LogModel> list = new ArrayList<LogModel> ();
        list.add(log);
        
        LogFileOperate logFileOperate = new LogFileOperate();
        
        logFileOperate.writeLogFile(list);
        
       List<LogModel> logs =  logFileOperate.readLogFile();
       System.out.println("����" + logs.get(0).getLogContent());
    }
}
