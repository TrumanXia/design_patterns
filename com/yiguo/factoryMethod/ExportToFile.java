package com.yiguo.factoryMethod;

public class ExportToFile implements ExportApi
{

    @Override
    public Boolean export(String data) {

        //        TODO ���ʵ�ֵ������ļ��� 
        System.out.println("�������ļ���" + data);
        return true;
    }

}
