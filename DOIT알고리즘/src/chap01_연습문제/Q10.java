package chap01_연습문제;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		
		do { 
			System.out.println("a의 값: ");
			a = stdIn.nextInt();
			System.out.println("b의 값: ");
			b = stdIn.nextInt();
		} while(b <= a);
		
		int result = b - a;
		System.out.println("b-a의 값은: " + result );
	}

}
