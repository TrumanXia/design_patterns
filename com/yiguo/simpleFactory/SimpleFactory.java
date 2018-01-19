package com.yiguo.simpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import exception.InputException;

/*
 *  面向接口编程
 */
public class SimpleFactory {
	
//	public static Api api;
	
	public static Api makeProduct (){
		return new Impl();
	}
	
	public static Api makeProduct (String condition) throws InputException{
		if (!"1".equals(condition) && !"2".equals(condition)){
			throw new InputException();
		} else if ("1".equals(condition)){
			return new Impl();
		}
			return new Impl2();
	}

	public static Api makeProductByReadingConfigurationFile (){
//		通过读取 配置文件来 生产对象
		Properties properties  = new Properties();
		InputStream inputStream =
				Client.class.getResourceAsStream("configuration.properties");
		
		try {
			properties.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
 
		Api api5 = null;
			try {
				api5 = (Api) Class.forName(properties.getProperty("classname")).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
		return api5;
	}
}
