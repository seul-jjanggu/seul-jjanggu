package D0416_class;

class MyException extends Exception {
	public MyException() {
		super("���� ����ó���Դϴ�");
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
