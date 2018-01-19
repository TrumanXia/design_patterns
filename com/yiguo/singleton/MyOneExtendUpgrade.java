package com.yiguo.singleton;

import java.util.HashMap;
import java.util.Map;

public class MyOneExtendUpgrade
{

    private static final String DEFAULT_PREKEY = "Cache";

    private static int num = 1;

    private static Map<String, MyOneExtendUpgrade> instanceContainer = new HashMap<String, MyOneExtendUpgrade>();

    private static int NUM_MAX = 3;

    private MyOneExtendUpgrade() {

    }

    public static MyOneExtendUpgrade getInstance() {

        String key = DEFAULT_PREKEY + num;
        MyOneExtendUpgrade instance = instanceContainer.get(key);

        if (instance == null) {
            instance = new MyOneExtendUpgrade();
            instanceContainer.put(key, instance);
        }
        num++;
        if (num > NUM_MAX) {
            num = 1;
        }

        return instance;
    }
}
