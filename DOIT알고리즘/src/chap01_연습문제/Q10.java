package chap01_��������;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		
		do { 
			System.out.println("a�� ��: ");
			a = stdIn.nextInt();
			System.out.println("b�� ��: ");
			b = stdIn.nextInt();
		} while(b <= a);
		
		int result = b - a;
		System.out.println("b-a�� ����: " + result );
	}

}
