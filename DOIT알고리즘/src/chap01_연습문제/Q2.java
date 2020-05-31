package chap01_연습문제;

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
		System.out.println("최솟값은: " + min3(3,2,1));

	}

}
