package com.lizhenbo.singleton;
/**
 * ����ģʽ:��֤�������ʵ��ֻ���ڴ���ֻ��һ��
 * ����ģʽ֮����ģʽ(���߳�)
 * ����Ҫ����Ķ�������ȥ����
 * @author LIZHENBO
 */
public class Singleton02 {
	//1.����һ��˽�еľ�̬����
	private static Singleton02 singleton02;
	//2.�ѹ��췽��˽�л�,�������Ͳ���ͨ�����췽����,����������ʵ��
	private Singleton02(){}
	//3.����һ�������ľ�̬����,���ͨ�������̬��������ȡ,�����ʵ��
	//ÿ�η��ʸ÷�����ʱ��,���ж�һ�±���singleton02�Ƿ�Ϊ��
	//1>.Ϊ��,���ʼ������singleton02,�ڷ��ض���
	//2>.��Ϊ��,��ֱ�ӷ��ظö���
	public static Singleton02 getInstance(){
		if(singleton02==null){
			singleton02=new Singleton02();
		}
		return singleton02;
	}
}
