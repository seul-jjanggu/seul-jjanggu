package chap01_연습문제;

public class Q3 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > c)
			min = c;
		if (min > d)
			min = d;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("최솟값은: " + min4(4,3,2,1));

	}

}
