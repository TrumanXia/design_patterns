package com.yiguo.singleton;

public class Client
{

    public static void main(String[] args) {
        
        System.out.println(MyOneExtendUpgrade.getInstance());
        System.out.println(MyOneExtendUpgrade.getInstance());
        System.out.println(MyOneExtendUpgrade.getInstance());
        System.out.println(MyOneExtendUpgrade.getInstance());
        System.out.println(MyOneExtendUpgrade.getInstance());
        System.out.println(MyOneExtendUpgrade.getInstance());
        
//        TODO �˽��������ڴ棬�������ɶ�����ε���gc���������
    }
}
