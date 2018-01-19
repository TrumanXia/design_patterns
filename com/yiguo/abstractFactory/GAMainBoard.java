package com.yiguo.abstractFactory;

public class GAMainBoard implements MainBoardApi
{

    @Override
    public void showID() {
        System.out.println("this is GA" + this.getClass().getName());
    }

    @Override
    public void installCpu() {
        System.out.println("cpu is installed");
    }

}
