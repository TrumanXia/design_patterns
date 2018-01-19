package com.yiguo.singleton;

import java.util.HashMap;
import java.util.Map;

/*
 *  按照缓存的思路，生成固定数量的实例
 */
public class MyOneExtend
{

    private static final String DEFAULT_PREKEY = "Cache";
    
    private static int num = 1;
    
    private static Map<String, Object> instanceContainer = new HashMap<String, Object>();
    
    private static int NUM_MAX = 3;
    
    public static MyOneExtend getInstance(){
        
        MyOneExtend instance;
        
//        if ( instanceContainer.get(DEFAULT_PREKEY+num) != null){
//            instance = (OneExtend) instanceContainer.
//        }
//        代码写的不好，出现重复代码 如 DEFAULT_PREKEY+num
//        而且取值不是当前编号的值，而是加1 之后的值
//        具体修改 件 MyOneExtendUpgrade
        instance = (MyOneExtend) instanceContainer.get(DEFAULT_PREKEY+num);
        if (instance == null){
            instanceContainer.put(DEFAULT_PREKEY+num, instance);
            num++;
        }
        if (num > NUM_MAX){
            num = 1;
        }
        return (MyOneExtend)instanceContainer.get(DEFAULT_PREKEY+num);
    }
    
    private MyOneExtend(){
        
    }
}
