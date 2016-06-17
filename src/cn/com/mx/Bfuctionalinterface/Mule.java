package cn.com.mx.Bfuctionalinterface;

public class Mule implements IHorse, IDonkey, IAnimal{


	public static void main(String[] args) {
		Mule mule =new Mule();
		mule.run();
		mule.breath();
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mule eat");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		IHorse.super.run();
	}
}
