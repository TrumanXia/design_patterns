package com.yiguo.factoryMethod;

// �������� �� ʹ�� �� �ڲ� ʵ�� �� ���� ���� ������ һЩ ���� ���� ���� ȥ ʵ�֡�
// ����Ҫ�ṩ�����Ĺ���ʱ�� ���� ����Ϊ �����࣬������  
// ��������ģʽ�ı��ʣ��ӳٵ�������ѡ��ʵ��
public abstract class ExportOperator
{
    
//    �ⲿ�� ���� �� ���� ExportOperator �� ���� �� ���еģ� ���� ��ȡ�� �����У�
//    Ҳ���� ���� ����ʲô���� ����Щ���� ������ȷ���С�
    
    public Boolean export(String data) {
                
        ExportApi operator = factoryMethod();
        operator.export(data);
        return true;
    }
    
//    �������� һ�� ������ ʹ�� ���Ʒ��ʷ� protected
//    ����û���ṩʵ�� ������ ������ �� ʵ��
//    ��ʵ���� Ҳ ���� �ṩĬ��ʵ�֣� Ҳ ��ΪΪ ���� �ṩ�� �ҹ���hook��
//    ��� ���� ��Ҫ���� ���������и���ʵ�֣����ַ��� ����Ժܸߡ�
    protected abstract ExportApi factoryMethod();

}
