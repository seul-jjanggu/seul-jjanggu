package D0414_class;

class A {
	void aMethod() { System.out.println("aMethod"); }
}
class B extends A {
	void bMethod() { System.out.println("bMethod"); }
}
public class test1 {
	
 public static void main(String[] args) {
		B b = new B();
		String className = b.getClass().getSimpleName();
		System.out.println(className);
		if(className == "B") {
			System.out.println("B o.k");
		}
		if(b instanceof B) {
			System.out.println("B o.k2");
		}
		boolean check1 = b instanceof A;
		System.out.println(check1);
		B b1 = null;
		boolean check2 = b instanceof A;
		System.out.println(check2);
 }
}

