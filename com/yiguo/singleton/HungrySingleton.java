package com.yiguo.singleton;

public class HungrySingleton
{
    
//    step 2 
    private static HungrySingleton hungrySingleton = new HungrySingleton();
//    step 1
    private HungrySingleton() {
        
    }
//    step 3 
    public static HungrySingleton getInstance () {
        
        return hungrySingleton;
    }
    
}
