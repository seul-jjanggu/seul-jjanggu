package D0416_class;

interface Animal {
	void breath();
}
class Dog implements Animal {
	public void breath() {
		System.out.println("Dog breath");
	}
	public void bark() {
		System.out.println("Dog Bark");
	}
}

class Cat implements Animal {
	public void breath() {
		System.out.println("Cat breath");
	}
	public void meow() {
		System.out.println("Cat meow");
	}
	
}
public class test2 {
	static void test(Animal a) {
		a.breath();
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = d;
		a.breath();
		Animal c = new Cat();
		c.breath();
		test(new Dog());
		test(new Cat());
	}
}
