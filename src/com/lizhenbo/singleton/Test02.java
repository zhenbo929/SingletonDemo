package com.lizhenbo.singleton;

public class Test02 {
	
	public static void main(String[] args) {
		//1:���߳�ģʽ��
		/*Singleton02 singleton01 = Singleton02.getInstance();
		Singleton02 singleton02 = Singleton02.getInstance();
		//������������,ͨ��Singleton02.getInstance()����ʼ��
		//���ǿ��Դ�ӡһ�����ǵ�hashcode,��ȷ��һ���Ƿ���ָ����ͬһ������
		System.out.println(singleton01.hashCode());
		System.out.println(singleton02.hashCode());*/
		//2.���߳�ģʽ��
		for(int i=0;i<10;i++){
			new Thread(){
				@Override
				public void run() {
					super.run();
					Singleton02 singleton02 = Singleton02.getInstance();
					System.out.println(singleton02.hashCode());
				}
			}.start();
		}
	}
}
