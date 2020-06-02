package chap01_연습문제;

import java.util.Scanner;

public class Q16 {
	
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {						// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i; j++) {				// n-i개의 " "를 나타냄
				System.out.print(" ");
			}			
			for (int j = 1; j <= (i - 1) * 2 + 1  ; j++) {	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print("*");					
			}
			System.out.println();							// 개행(줄변환)
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		
		
		do {
			System.out.print("단수는 ：");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		System.out.println( n + "단 피라미드 삼각형 모양으로 나타냅니다.");
		spira(n);
	}
}
