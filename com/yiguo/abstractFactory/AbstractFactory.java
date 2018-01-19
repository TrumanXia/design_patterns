package com.yiguo.abstractFactory;

//抽象工厂 提供一个创建一系列或者相互依赖对象的接口，而无需指定他们具体的类
public interface AbstractFactory
{

    public CPUApi createCpu();
    
    public MainBoardApi createMainBoard();
    
}
