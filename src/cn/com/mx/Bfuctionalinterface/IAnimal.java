package cn.com.mx.Bfuctionalinterface;

public interface IAnimal {
	default void breath(){
		System.out.println("breath!");
	}
}
