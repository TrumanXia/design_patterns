package com.yiguo.abstractFactory;

public class ComputerEngineer
{
    
    public void makeComputer(){
        
        Schema1 schema1 = new Schema1();
        prepareHardwares(schema1);
    }
    
    public void prepareHardwares(AbstractFactory schema){
        
        CPUApi cup = schema.createCpu();
        MainBoardApi mainBoard =  schema.createMainBoard();
        
        System.out.println("·½°¸Ò»£º");
        cup.showID();
        mainBoard.showID();;
    }
}
