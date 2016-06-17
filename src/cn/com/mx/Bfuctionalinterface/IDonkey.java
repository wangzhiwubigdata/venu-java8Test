package cn.com.mx.Bfuctionalinterface;

public interface IDonkey {
	void eat();
	default void run(){
		System.out.println("Donkey run");
	}
}
