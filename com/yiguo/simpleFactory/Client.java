package com.yiguo.simpleFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.xml.sax.InputSource;

import exception.InputException;

public class Client {

	public static void main(String[] args) {
		// �����ü򵥹����ķ�ʽ, ������ �ӿ� �� ʵ���� �� ��¶�� �� ���ýӿڵ� �ͻ���
//		û��ʵ������װ���롱��˼�롣��� Ҳ ������ ��̬ ��˼��
//		Api api = new Impl();
//		api.aMethod();
		
		// ���ü򵥹����ķ�ʽ 
//		Api api =  SimpleFactory.makeProduct();
//		api.aMethod();
		
//		�򵥹�����ʹ�� ���� ��ȡ ��Ʒ
//		Api api2 = (Api) ReflexFactory.makeProduct("com.yiguo.simpleFactory.Impl");
//		api2.aMethod();
		
//		���÷��� ��ȡ ��Ʒ
//		ͬһ�����У�class�ļ����Բ��� ����
//		Api api3 = ReflexFactory.makeProduct(com.yiguo.simpleFactory.Impl.class);
//		api3.aMethod();
		
//		�������÷��Ͷ� ����Ĳ��������޶�, ����һ�� û�� ʵ�� Api�ӿڵ�Type������ʱ�ͻᱨ��
//		ReflexFactory.makeProduct(AnotherObject.class);
		
//		�򵥹������Ը����������ж�
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
