package com.yiguo.factoryMethod;

public class EportToDB implements ExportApi
{

    @Override
    public Boolean export(String data) {
        
        System.out.println("���������ݿ���" + data);
        return true;
    }

}
