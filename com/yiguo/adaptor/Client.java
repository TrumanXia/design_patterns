package com.yiguo.adaptor;

import java.util.ArrayList;
import java.util.List;

public class Client
{

    public static void main(String[] args) {

//        new LogFileOperate ().readLogFile();
        LogModel log = new LogModel();
//        TODO 研究 下 输入 输出 流的问题
        log.setLogId("1");
        log.setOperateTime("2018年1月14日21:37:15");
        log.setOperateUser("truman");
        log.setLogContent("domain");
        
        List<LogModel> list = new ArrayList<LogModel> ();
        list.add(log);
        
        LogFileOperate logFileOperate = new LogFileOperate();
        
        logFileOperate.writeLogFile(list);
        
       List<LogModel> logs =  logFileOperate.readLogFile();
       System.out.println("内容" + logs.get(0).getLogContent());
    }
}
