package chap01_��������;

import java.util.Scanner;

public class Q17 {
	
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n -i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*(i - 1) + 1; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("�ܼ���: ");
			n = stdIn.nextInt();
		} while(n <= 0);
		
		System.out.println("���� �Ƕ�̵带 ����մϴ�.");
		npira(n);
	}
}
