package com.yiguo.factoryMethod;

public class Clinet
{

    public static void main(String[] args) {

        // ��߰� ʵ���� ��¶ �� �ͻ���
        // ExportOperator exportOperator = new ExportFileOperator();
        // exportOperator.export("good");

        // ExportOperator2 exportOperator2 = new ExportOperator2();
        // exportOperator2.factoryMethod(1).export("goog");

        ExportOperator3 exportOperator3 = new ExportOperator3();
        exportOperator3.factoryMethod(3).export("goog");

    }
}
