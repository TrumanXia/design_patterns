package com.yiguo.factoryMethod;

public class EportToDB implements ExportApi
{

    @Override
    public Boolean export(String data) {
        
        System.out.println("导出到数据库中" + data);
        return true;
    }

}
