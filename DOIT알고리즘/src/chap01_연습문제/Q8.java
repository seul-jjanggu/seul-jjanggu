package chap01_연습문제;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값: ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		if(n%2 == 0) { //입력받은 끝 번호가 짝수라면 그냥 가우스 덧셈
			sum = (1+n)*(n/2);
			
		}else //입력받은 끝 번호가 홀수라면 (가우스덧셈) - 중간값
			sum = (1+n)*((1+n)/2) - ((1+n)/2);
		
		System.out.println(sum);
	}
}
