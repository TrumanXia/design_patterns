package com.yiguo.abstractFactory;

public class Client
{

    public static void main(String[] args) {
        
        ComputerEngineer engineer = new ComputerEngineer();
        engineer.makeComputer();
    }
}
