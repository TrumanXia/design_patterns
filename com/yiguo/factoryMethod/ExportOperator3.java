package com.yiguo.factoryMethod;

public class ExportOperator3 extends ExportOperator2
{

    @Override
    protected ExportApi factoryMethod(int type) {

        ExportApi api = null;
        if (3 == type){
            api = new ExportXML();
        } else {
            api = super.factoryMethod(type);
        }
        return api;
    }
}
