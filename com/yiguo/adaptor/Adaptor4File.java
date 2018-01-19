package com.yiguo.adaptor;

import java.util.List;

// LogDBOperateApi 就是 一个 target。通过adaptor 将 adaptee 适配成 target
public class Adaptor4File implements LogDBOperateApi
{

    // 如果想要适配 多个功能， 可以 依赖多个 不同功能的adaptee
    private LogFileOperateApi adaptee;
    
    public Adaptor4File(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel logModel) {
        
        List<LogModel> list =  adaptee.readLogFile();
        list.add(logModel);
        
        adaptee.writeLogFile(list);
        
    }

    @Override
    public List<LogModel> retriveLog() {
        
        List<LogModel> list =  adaptee.readLogFile();
        return list;
    }

    @Override
    public void updateLog(LogModel logModel) {

        List<LogModel> list =  adaptee.readLogFile();

// 进行更新操作 如果使用for循环，无法获取list列表的索引号
//        for (LogModel log : list){
//            if (loggetLogId().equals(logModel.getLogId())){
//                list.set(, log)
//            }
//        }
        
        for (int i=0; i<list.size(); i++){
            if ( logModel.getLogId().equals( list.get(i).getLogId() ) ){
                list.set(i, logModel);
            }
        }
        
        adaptee.writeLogFile(list);
    }

    @Override
    public void deleteLog(LogModel logModel) {

        List<LogModel> list =  adaptee.readLogFile();
        list.remove(logModel);
        
        adaptee.writeLogFile(list);
    }

}
