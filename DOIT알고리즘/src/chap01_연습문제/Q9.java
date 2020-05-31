package chap01_연습문제;

import java.util.Scanner;

public class Q9 {
	static int sumof(int a, int b) {
	int min;
	int max;
	
	if (a > b) {
		max = a;
		min = b;
	}
	else {
		max = b;
		min = a;
	}
	int sum = 0;
	for (int i = min; i <= max; i++ ) 
		sum += i;		
	return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a를 입력하세요.: ");
		int a = stdIn.nextInt();
		System.out.println("b를 입력하세요.: ");
		int b = stdIn.nextInt();
		
		System.out.println("a와 b 사이의 모든 정수의 합은: " + sumof(a,b));
	}
}
