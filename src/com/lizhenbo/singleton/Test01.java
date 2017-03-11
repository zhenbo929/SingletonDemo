package com.lizhenbo.singleton;

public class Test01 {
	
	public static void main(String[] args) {
		
		Singleton01 singleton01 = Singleton01.getInstance();
		Singleton01 singleton02 = Singleton01.getInstance();
		//������������,ͨ��Singleton01.getInstance()����ʼ��
		//���ǿ��Դ�ӡһ�����ǵ�hashcode,��ȷ��һ���Ƿ���ָ����ͬһ������
		//ΪʲôhashCode��������ȷ���Ƿ���ͬһ������?(�����ǹٷ�API�Ľ���)
		//ʵ���ϣ��� Object �ඨ��� hashCode ����ȷʵ����Բ�ͬ�Ķ��󷵻ز�ͬ��������
		//����һ����ͨ�����ö�����ڲ���ַת����һ��������ʵ�ֵģ����� JavaTM ������Բ���Ҫ����ʵ�ּ��ɡ��� 
		System.out.println(singleton01.hashCode());
		System.out.println(singleton02.hashCode());
	}
}
