package D0416_class;

interface IAnimal {
	void breath();
}
abstract class Dog6 implements IAnimal {
	public abstract void breath();
}
class Dog5 extends Dog6 {
	public void breath() {
		System.out.println("Dog breath");
	}
}
public class test6 {
	public static void main(String[] args) {
		IAnimal a = new Dog5();
		a.breath();

	}

}
