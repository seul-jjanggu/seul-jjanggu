package chap01_��������;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("���� ������ �Է��ϼ���.: ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		int num = 0;
		while(n > 0) {
			n /= 10;
			//System.out.println("n = "+ n);
			num++;
		}
		System.out.println("�� ���� " + num + "�ڸ��Դϴ�.");
	}
}
