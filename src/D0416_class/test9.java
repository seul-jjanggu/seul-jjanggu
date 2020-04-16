package D0416_class;

class MyException extends Exception {
	public MyException() {
		super("나의 예외처리입니다");
	}
}
public class test9 {
	public static void main(String[] args) throws MyException {
		int n = 3;
		if(n == 3) {
			throw new MyException();
		}
	}
}
