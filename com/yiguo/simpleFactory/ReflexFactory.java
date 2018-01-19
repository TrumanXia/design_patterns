package com.yiguo.simpleFactory;

public class ReflexFactory {

	//  ��Object ��Ϊ ����ֵ
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
//	TODO ʹ�÷��� �� T ���� �޶�
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
