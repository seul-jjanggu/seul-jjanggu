package chap01_��������;

import java.util.Scanner;

public class Q16 {
	
	static void spira(int n) {
		for (int i = 1; i <= n; i++) {						// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= n - i; j++) {				// n-i���� " "�� ��Ÿ��
				System.out.print(" ");
			}			
			for (int j = 1; j <= (i - 1) * 2 + 1  ; j++) {	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print("*");					
			}
			System.out.println();							// ����(�ٺ�ȯ)
		}
	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		
		
		do {
			System.out.print("�ܼ��� ��");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		System.out.println( n + "�� �Ƕ�̵� �ﰢ�� ������� ��Ÿ���ϴ�.");
		spira(n);
	}
}
