package com.lizhenbo.singleton;
/**
 * 单例模式:保证了这类的实例只在内存中只有一个
 * 单例模式之饿汉模式
 * 通过静态初始化的方式,来构建单例(所以不需要考虑线程安全问题)
 * @author LIZHENBO
 */
public class Singleton01 {
	//1.创建一个私有的静态属性,因为静态属性属于类不属于对象,所以会在应用程序一开始运行就进行初始化
	private static Singleton01 singleton01=new Singleton01();
	//2.把构造方法私有化,这样外界就不能通过构造方法来,创建这个类的实例
	private Singleton01(){}
	//3.创建一个公共的静态方法,外界通过这个静态方法来获取,该类的实例
	//因为每次返回出去的对象都是在程序一开始就初始化的那个对象,就保证了这类的实例只在内存中只有一个
	public static Singleton01 getInstance(){
		return singleton01;
	}
}
