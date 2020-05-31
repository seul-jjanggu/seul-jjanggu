package chap01_연습문제;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("양의 정수를 입력하세요.: ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int num = 0;
		while(n > 0) {
			n /= 10;
			//System.out.println("n = "+ n);
			num++;
		}
		System.out.println("그 수는 " + num + "자리입니다.");
	}
}
