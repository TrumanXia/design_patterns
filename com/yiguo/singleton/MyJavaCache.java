package com.yiguo.singleton;

import java.util.HashMap;
import java.util.Map;

public class MyJavaCache
{

    private Map<String, Object> cache = new HashMap<String, Object>();
    
    public Object getValue(String key){
        
//        ��ߴ��� return������ظ������Խ��á���ĥ���ģʽ���еĴ��롣
        if (cache.containsKey(key)){
            return cache.get(key);  
        } else {
//            �� �ļ� �� ���ݿ� �л�ȡ ��Ӧ��ֵ�����ŵ�map�У����� ֻ�� �򻯲�����
            cache.put(key, key+"value");
            return cache.get(key);
        }
    }
}
