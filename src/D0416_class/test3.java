package D0416_class;

interface IShare {
	void draw(int x, int y);
}
class Circle implements IShare {
	public void draw(int a, int b) {
		System.out.println("Draw a Circle: " + a + ", " + b);
	}
}
class Rectangle implements IShare {
	public void draw(int a, int b) {
		System.out.println("Draw a Rectangle: " + a + ", " + b);
	}
}
class DrawManger {
	IShare s;
	public DrawManger(IShare s) { //IShare = new Circle();
		this.s = s;
	}
	public void draw(int s, int t) {
		this.s.draw(s, t);
	}
}
public class test3 {
	public static void main(String[] args) {
		DrawManger d = new DrawManger(new Rectangle());
		d.draw(1, 2);
	}
}
