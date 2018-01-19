package com.yiguo.abstractFactory;

public class IntelCpu implements CPUApi
{

    @Override
    public void showID() {
        System.out.println("this is intel cpu");
    }

    @Override
    public void calculate() {
        System.out.println("intel calculates good!");
    }
}
