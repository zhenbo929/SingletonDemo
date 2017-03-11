package com.lizhenbo.singleton;
/**
 * 单例模式:保证了这类的实例只在内存中只有一个
 * 单例模式之懒汉模式(单线程)
 * 当需要该类的对象是再去构建
 * @author LIZHENBO
 */
public class Singleton02 {
	//1.创建一个私有的静态属性
	private static Singleton02 singleton02;
	//2.把构造方法私有化,这样外界就不能通过构造方法来,创建这个类的实例
	private Singleton02(){}
	//3.创建一个公共的静态方法,外界通过这个静态方法来获取,该类的实例
	//每次访问该方法的时候,向判断一下变量singleton02是否为空
	//1>.为空,这初始化变量singleton02,在返回对象
	//2>.不为空,则直接返回该对象
	public static Singleton02 getInstance(){
		if(singleton02==null){
			singleton02=new Singleton02();
		}
		return singleton02;
	}
}
