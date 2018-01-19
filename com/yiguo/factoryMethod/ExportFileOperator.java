package com.yiguo.factoryMethod;

public class ExportFileOperator extends ExportOperator
{

    @Override
    public ExportApi factoryMethod() {
        ExportToFile exportToFile = new ExportToFile();
        return exportToFile;
    }

}
