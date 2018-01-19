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
        
//        TODO 了解如何清空内存，重新生成对象，如何调用gc来处理对象
    }
}
