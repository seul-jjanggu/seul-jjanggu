package chap01_��������;

public class Q2 {
	static int min3(int a, int b, int c) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("�ּڰ���: " + min3(3,2,1));

	}

}
