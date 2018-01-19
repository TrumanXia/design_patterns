package com.yiguo.abstractFactory;

public class MSIMainBoard implements MainBoardApi
{

    @Override
    public void showID() {
        System.out.println("this id msi" + this.getClass().getName());
    }

    @Override
    public void installCpu() {
        System.out.println("cpu is installed");
    }
}
