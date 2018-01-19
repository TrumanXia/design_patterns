package com.yiguo.adaptor;

import java.util.List;

// 一般是将老的版本 适配 为 新的版本
// 可以参看 Adaptor4File
public class Adaptor implements LogFileOperateApi
{

    public LogDBOperate logDB = new LogDBOperate();
    
    public Adaptor(LogDBOperate logdb) {
        this.logDB = logdb;
    }
    
    @Override
    public List<LogModel> readLogFile() {
        return logDB.retriveLog();
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        
    }

//    @Override
//    public void writeLogFile(List<LogModel> list) {
//        logDB.createLog();
//    }

}
