package chap02_��������;

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
		
		System.out.print("��� ��:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		
		
		System.out.println("�迭�� ��� ����� �հ踦 ���մϴ�."+ sumOf(a));
		
		}
		
	}

