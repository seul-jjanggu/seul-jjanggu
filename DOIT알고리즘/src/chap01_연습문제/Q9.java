package chap01_��������;

import java.util.Scanner;

public class Q9 {
	static int sumof(int a, int b) {
	int min;
	int max;
	
	if (a > b) {
		max = a;
		min = b;
	}
	else {
		max = b;
		min = a;
	}
	int sum = 0;
	for (int i = min; i <= max; i++ ) 
		sum += i;		
	return sum;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a�� �Է��ϼ���.: ");
		int a = stdIn.nextInt();
		System.out.println("b�� �Է��ϼ���.: ");
		int b = stdIn.nextInt();
		
		System.out.println("a�� b ������ ��� ������ ����: " + sumof(a,b));
	}
}
