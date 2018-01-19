package com.yiguo.factoryMethod;

// 工厂方法 的 使用 ： 内部 实现 了 部分 方法 ，还有 一些 方法 留给 子类 去 实现。
// 当需要提供公共的功能时， 可以 设置为 抽象类，如下类  
// 工厂方法模式的本质：延迟到子类来选择实现
public abstract class ExportOperator
{
    
//    这部分 功能 是 所有 ExportOperator 的 子类 都 共有的， 所有 提取到 父类中，
//    也就是 不管 生产什么子类 ，这些方法 总能正确运行。
    
    public Boolean export(String data) {
                
        ExportApi operator = factoryMethod();
        operator.export(data);
        return true;
    }
    
//    工厂方法 一般 不对外 使用 控制访问符 protected
//    这里没有提供实现 ，而是 有子类 来 实现
//    其实父类 也 可以 提供默认实现， 也 称为为 子类 提供了 挂钩（hook）
//    如果 子类 需要覆盖 ，可以自行覆盖实现，这种方法 灵活性很高。
    protected abstract ExportApi factoryMethod();

}
