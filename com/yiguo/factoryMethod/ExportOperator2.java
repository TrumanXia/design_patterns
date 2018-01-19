package com.yiguo.factoryMethod;

import java.awt.event.MouseWheelEvent;

// 参数化的 工厂方法 ，提供默认的实现，需要添加 直接在子类中覆盖就好了
public class ExportOperator2
{
    // 这部分 功能 是 所有 ExportOperator 的 子类 都 共有的， 所有 提取到 父类中，
    // 也就是 不管 生产什么子类 ，这些方法 总能正确运行。
    public Boolean export(String data) {

        ExportApi operator = factoryMethod(1);
        operator.export(data);
        return true;
    }

    // 工厂方法 一般 不对外 使用 控制访问符 protected
    // 这里没有提供实现 ，而是 有子类 来 实现
    // 其实父类 也 可以 提供默认实现， 也 称为为 子类 提供了 挂钩（hook）
    // 如果 子类 需要覆盖 ，可以自行覆盖实现，这种方法 灵活性很高。
    protected ExportApi factoryMethod(int type) {
        
        ExportApi api = null;
        if (1 == type) {
            api = new ExportToFile();
        } else if (2 == type){
            api = new EportToDB();
        }
        return api;
    }
}
