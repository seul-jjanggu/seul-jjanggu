package chap01;

import java.util.Scanner;

public class �ǽ�1C_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ� ������ �Է��ϼ���.");
		
		do {
			System.out.println("�Է�: ");
			no = stdIn.nextInt();
		} while(no < 10 || no > 99); //no�� 10���� �۰ų� 99���� ũ�� do ���� while(true��) do ����
		
		System.out.println("���� no�� ���� " + no +"��(��) �Ǿ����ϴ�.");
	}

}
