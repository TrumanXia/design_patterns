package com.yiguo.abstractFactory;

public class AMDCpu implements CPUApi
{

    @Override
    public void showID() {
        System.out.println("this is AMD cpu"+this.getClass().getName());
    }

    @Override
    public void calculate() {
        System.out.println("AMD calculates good!");
    }

}
