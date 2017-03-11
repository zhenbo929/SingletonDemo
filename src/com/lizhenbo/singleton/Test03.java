package com.lizhenbo.singleton;

public class Test03 {
	
	public static void main(String[] args) {
		
		//多线程模式下
		for(int i=0;i<10;i++){
			new Thread(){
				@Override
				public void run() {
					super.run();
					Singleton03 singleton03 = Singleton03.getInstance();
					System.out.println(singleton03.hashCode());
				}
			}.start();
		}
	}
}
