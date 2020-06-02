package chap02_연습문제;

import java.util.Scanner;

public class Q3 {
	
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟 수:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		
		
		System.out.println("배열의 모든 요소의 합계를 구합니다."+ sumOf(a));
		
		}
		
	}

