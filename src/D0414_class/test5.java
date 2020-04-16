package D0414_class;
class Box1{
	private String conts;
	
	Box1(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts;
	}
}

public class test5 {
	public static void main(String[] args) {
		Box1[] ar = new Box1[3];
		
		ar[0] = new Box1("First");
		ar[1] = new Box1("Second");
		ar[2] = new Box1("Third");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}
