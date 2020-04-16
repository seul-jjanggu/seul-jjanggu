package D0416_class;

class MyClass {
	void method() throws IOException {
		throw new IOException("device error");
	}
}

public class test8 {
	public static void main(String[] args) {
	MyClass c = new MyClass();
	c.method();
//		int a = 0;
//		int b = 0;
//		int c = a / b;
	}
}
