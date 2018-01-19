package com.yiguo.abstractFactory;

public class Schema2 implements AbstractFactory
{

    @Override
    public CPUApi createCpu() {
        return new AMDCpu();
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new MSIMainBoard();
    }


}
