package com.yiguo.abstractFactory;

//���󹤳� �ṩһ������һϵ�л����໥��������Ľӿڣ�������ָ�����Ǿ������
public interface AbstractFactory
{

    public CPUApi createCpu();
    
    public MainBoardApi createMainBoard();
    
}
