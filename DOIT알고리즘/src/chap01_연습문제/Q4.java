package chap01_��������;

import java.util.Scanner;

public class Q4 {
	static int �߾Ӱ�(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ���� �Է��ϼ���.");
		System.out.println("a�� ��: ");
		int a = stdIn.nextInt();
		System.out.println("b�� ��: ");
		int b = stdIn.nextInt();
		System.out.println("c�� ��: ");
		int c = stdIn.nextInt();
		
		System.out.println("�߾Ӱ��� " + �߾Ӱ�(a, b, c) + "�Դϴ�." );
	}

}
