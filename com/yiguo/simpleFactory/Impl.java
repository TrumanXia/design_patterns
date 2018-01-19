package com.yiguo.simpleFactory;

public class Impl implements Api{

	// override 可以保证子类 在 覆盖 父类 方法 时，不出错。
	@Override 
	public void aMethod(){
		
		System.out.println("this is implementation of Api Interface");
		
	}
}
