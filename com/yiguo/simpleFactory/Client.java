package com.yiguo.simpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.xml.sax.InputSource;

import exception.InputException;

public class Client {

	public static void main(String[] args) {
		// 不采用简单工厂的方式, 但这样 接口 和 实现类 均 暴露给 了 调用接口的 客户端
//		没有实践“封装隔离”的思想。这边 也 体现了 多态 的思想
//		Api api = new Impl();
//		api.aMethod();
		
		// 采用简单工厂的方式 
//		Api api =  SimpleFactory.makeProduct();
//		api.aMethod();
		
//		简单工厂中使用 反射 获取 产品
//		Api api2 = (Api) ReflexFactory.makeProduct("com.yiguo.simpleFactory.Impl");
//		api2.aMethod();
		
//		利用泛型 获取 产品
//		同一个包中，class文件可以不加 包名
//		Api api3 = ReflexFactory.makeProduct(com.yiguo.simpleFactory.Impl.class);
//		api3.aMethod();
		
//		可以利用泛型对 传入的参数进行限定, 传入一个 没有 实现 Api接口的Type，编译时就会报错。
//		ReflexFactory.makeProduct(AnotherObject.class);
		
//		简单工厂可以根据条件来判断
//		try {
//			Api api4 = SimpleFactory.makeProduct("3");
//			api4.aMethod();
//		} catch (InputException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Api api5 = SimpleFactory.makeProductByReadingConfigurationFile();
		api5.aMethod();
	}
}
