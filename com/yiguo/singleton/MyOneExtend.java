package com.yiguo.singleton;

import java.util.HashMap;
import java.util.Map;

/*
 *  ���ջ����˼·�����ɹ̶�������ʵ��
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
//        ����д�Ĳ��ã������ظ����� �� DEFAULT_PREKEY+num
//        ����ȡֵ���ǵ�ǰ��ŵ�ֵ�����Ǽ�1 ֮���ֵ
//        �����޸� �� MyOneExtendUpgrade
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
