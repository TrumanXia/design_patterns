package com.yiguo.factoryMethod;

import java.awt.event.MouseWheelEvent;

// �������� �������� ���ṩĬ�ϵ�ʵ�֣���Ҫ��� ֱ���������и��Ǿͺ���
public class ExportOperator2
{
    // �ⲿ�� ���� �� ���� ExportOperator �� ���� �� ���еģ� ���� ��ȡ�� �����У�
    // Ҳ���� ���� ����ʲô���� ����Щ���� ������ȷ���С�
    public Boolean export(String data) {

        ExportApi operator = factoryMethod(1);
        operator.export(data);
        return true;
    }

    // �������� һ�� ������ ʹ�� ���Ʒ��ʷ� protected
    // ����û���ṩʵ�� ������ ������ �� ʵ��
    // ��ʵ���� Ҳ ���� �ṩĬ��ʵ�֣� Ҳ ��ΪΪ ���� �ṩ�� �ҹ���hook��
    // ��� ���� ��Ҫ���� ���������и���ʵ�֣����ַ��� ����Ժܸߡ�
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
