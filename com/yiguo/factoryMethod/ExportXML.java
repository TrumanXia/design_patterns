package com.yiguo.factoryMethod;

public class ExportXML implements ExportApi
{

    @Override
    public Boolean export(String data) {
        System.out.println("xml" + data);
        return null;
    }

}
