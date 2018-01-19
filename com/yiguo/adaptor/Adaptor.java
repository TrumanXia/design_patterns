package com.yiguo.adaptor;

import java.util.List;

// һ���ǽ��ϵİ汾 ���� Ϊ �µİ汾
// ���Բο� Adaptor4File
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
