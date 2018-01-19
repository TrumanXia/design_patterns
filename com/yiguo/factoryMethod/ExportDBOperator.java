package com.yiguo.factoryMethod;

public class ExportDBOperator extends ExportOperator
{

    @Override
    public ExportApi factoryMethod() {
        ExportApi exportApi = new EportToDB();
        return exportApi;
    }

}
