package D0416_class;

public class test7 {

	public static void main(String[] args) {
		try {
//			int a = 3;
//			int b = 0;
//			int c = a / b ;
			int a[] = new int[5];
			a[5] = 0;
			//a[5] = 30 / 0;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("0으로 나누었습니다");
			System.out.println(e.getMessage());
		} catch(ArithmeticException e) {
			//ArithmeticException e = new ArithmeticException();
			System.out.println("0으로 나누었습니다.");
			System.out.println(e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception");
		}
	}
}
