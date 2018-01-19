package com.yiguo.adaptor;

import java.util.List;

// LogDBOperateApi ���� һ�� target��ͨ��adaptor �� adaptee ����� target
public class Adaptor4File implements LogDBOperateApi
{

    // �����Ҫ���� ������ܣ� ���� ������� ��ͬ���ܵ�adaptee
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

// ���и��²��� ���ʹ��forѭ�����޷���ȡlist�б��������
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
