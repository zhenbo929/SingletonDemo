package com.lizhenbo.singleton;
/**
 * 单例模式:保证了这类的实例只在内存中只有一个
 * 单例模式之懒汉模式(多线程)
 * 当需要该类的对象是再去构建
 * @author LIZHENBO
 */
public class Singleton03 {
	//1.创建一个私有的静态属性
	private static Singleton03 singleton03;
	//2.把构造方法私有化,这样外界就不能通过构造方法来,创建这个类的实例
	private Singleton03(){}
	//3.创建一个公共的静态方法,外界通过这个静态方法来获取,该类的实例
	//每次访问该方法的时候,先判断一下变量singleton03是否为空
	//1>.不为空,则直接返回该对象
	//2>.为空,则加锁,去初始化变量singleton03,在返回对象
		//<1>.加锁的里面还要考虑,两个线程同时等待在加锁的位置,所以要再次判断是否为空
	public static Singleton03 getInstance(){
		if(singleton03==null){//第一次判断是否为空,是为了效率考虑
			synchronized (Singleton03.class) {
				if(singleton03==null){//第二次判断为空,是为了安全考虑
					singleton03=new Singleton03();
				}
			}
		}
		return singleton03;
	}
}
