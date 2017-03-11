package com.lizhenbo.singleton;
/**
 * ����ģʽ:��֤�������ʵ��ֻ���ڴ���ֻ��һ��
 * ����ģʽ֮����ģʽ(���߳�)
 * ����Ҫ����Ķ�������ȥ����
 * @author LIZHENBO
 */
public class Singleton03 {
	//1.����һ��˽�еľ�̬����
	private static Singleton03 singleton03;
	//2.�ѹ��췽��˽�л�,�������Ͳ���ͨ�����췽����,����������ʵ��
	private Singleton03(){}
	//3.����һ�������ľ�̬����,���ͨ�������̬��������ȡ,�����ʵ��
	//ÿ�η��ʸ÷�����ʱ��,���ж�һ�±���singleton03�Ƿ�Ϊ��
	//1>.��Ϊ��,��ֱ�ӷ��ظö���
	//2>.Ϊ��,�����,ȥ��ʼ������singleton03,�ڷ��ض���
		//<1>.���������滹Ҫ����,�����߳�ͬʱ�ȴ��ڼ�����λ��,����Ҫ�ٴ��ж��Ƿ�Ϊ��
	public static Singleton03 getInstance(){
		if(singleton03==null){//��һ���ж��Ƿ�Ϊ��,��Ϊ��Ч�ʿ���
			synchronized (Singleton03.class) {
				if(singleton03==null){//�ڶ����ж�Ϊ��,��Ϊ�˰�ȫ����
					singleton03=new Singleton03();
				}
			}
		}
		return singleton03;
	}
}
