package D0414_class;
class Animal {}
class Dog extends Animal {
}
public class test2 {
	public static void main(String[] args) {
		Animal a = new Dog();
		if(a instanceof Dog) {
		Dog d = (Dog)a;

	}
}
}
