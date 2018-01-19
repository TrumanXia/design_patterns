package com.yiguo.factoryMethod;

public class ExportToFile implements ExportApi
{

    @Override
    public Boolean export(String data) {

        //        TODO 如何实现导出到文件？ 
        System.out.println("导出到文件中" + data);
        return true;
    }

}
