package com.yiguo.abstractFactory;

public class Schema1 implements AbstractFactory
{

    @Override
    public CPUApi createCpu() {
        return new IntelCpu();
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new GAMainBoard();
    }


}
