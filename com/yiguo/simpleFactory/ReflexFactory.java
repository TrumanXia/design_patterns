package com.yiguo.simpleFactory;

public class ReflexFactory {

	//  用Object 作为 返回值
	public static Object  makeProduct (String clsname ){
		
	    Object object = null;
		try {
			Class<?> class1 =  Class.forName(clsname);
			try {
				object = class1.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return object;
	}
//	TODO 使用泛型 对 T 进行 限定
	public static  <T extends Api> T makeProduct (Class<T> cls){
		
		T impl = null;
		try {
			impl = cls.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		return  impl;
	}
}
