package chap01_��������;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� ��: ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		if(n%2 == 0) { //�Է¹��� �� ��ȣ�� ¦����� �׳� ���콺 ����
			sum = (1+n)*(n/2);
			
		}else //�Է¹��� �� ��ȣ�� Ȧ����� (���콺����) - �߰���
			sum = (1+n)*((1+n)/2) - ((1+n)/2);
		
		System.out.println(sum);
	}
}
