package com.lizhenbo.singleton;

public class Test02 {
	
	public static void main(String[] args) {
		//1:单线程模式下
		/*Singleton02 singleton01 = Singleton02.getInstance();
		Singleton02 singleton02 = Singleton02.getInstance();
		//声明两个变量,通过Singleton02.getInstance()来初始化
		//我们可以打印一下他们的hashcode,来确认一下是否是指向了同一个对象
		System.out.println(singleton01.hashCode());
		System.out.println(singleton02.hashCode());*/
		//2.多线程模式下
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
