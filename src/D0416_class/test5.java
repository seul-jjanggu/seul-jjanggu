package D0416_class;

abstract class Animal3 {
	public abstract void breath();
	public void eat() {
		System.out.println("Animal eat");
	}
}
class Dog3 extends Animal3 {
	public void breath() {
		System.out.println("Dog breath");
	}
}

public class test5 {
	public static void main(String[] args) {
		Animal3 a = new Dog3();
		a.breath();
	}

}
