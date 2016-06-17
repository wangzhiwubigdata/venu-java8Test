package cn.com.mx.Bfuctionalinterface;

public interface IHorse {
	abstract void eat();
	default void run(){
		System.out.println("horse run!");
	}
}
