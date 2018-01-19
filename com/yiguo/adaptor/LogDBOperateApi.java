package com.yiguo.adaptor;

import java.util.List;

public interface LogDBOperateApi
{

    public void createLog(LogModel logModel);
    
    public List<LogModel> retriveLog();
    
    public void updateLog(LogModel logModel);
    
    public void deleteLog(LogModel logModel);
    
}
