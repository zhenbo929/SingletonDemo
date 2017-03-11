package com.lizhenbo.singleton;

public class Test01 {
	
	public static void main(String[] args) {
		
		Singleton01 singleton01 = Singleton01.getInstance();
		Singleton01 singleton02 = Singleton01.getInstance();
		//声明两个变量,通过Singleton01.getInstance()来初始化
		//我们可以打印一下他们的hashcode,来确认一下是否是指向了同一个对象
		//为什么hashCode方法可以确定是否是同一个对象?(下面是官方API的解释)
		//实际上，由 Object 类定义的 hashCode 方法确实会针对不同的对象返回不同的整数。
		//（这一般是通过将该对象的内部地址转换成一个整数来实现的，但是 JavaTM 编程语言不需要这种实现技巧。） 
		System.out.println(singleton01.hashCode());
		System.out.println(singleton02.hashCode());
	}
}
