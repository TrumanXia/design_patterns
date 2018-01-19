package com.yiguo.singleton;

import java.util.HashMap;
import java.util.Map;

public class MyJavaCache
{

    private Map<String, Object> cache = new HashMap<String, Object>();
    
    public Object getValue(String key){
        
//        这边代码 return语句有重复，可以借用《研磨设计模式》中的代码。
        if (cache.containsKey(key)){
            return cache.get(key);  
        } else {
//            到 文件 或 数据库 中获取 相应的值，并放到map中，这里 只是 简化操作。
            cache.put(key, key+"value");
            return cache.get(key);
        }
    }
}
