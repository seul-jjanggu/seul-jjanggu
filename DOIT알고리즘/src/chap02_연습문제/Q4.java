package chap02_��������;

import java.util.Scanner;

public class Q4 {
	static void copy(int[] a, int[] b) {
		if (a.length == b.length)
			for (int i = 0; i < a.length; i++) {
				a[i] = b[i];
				System.out.println("a[" + i + "] = " + a[i] + "/ b[" + i + "] = " + b[i]);
			}
		}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��ڼ� : " );
		int na = stdIn.nextInt();
		
		int[] a = new int[na];
		
		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		System.out.print("�迭 b�� ��ڼ� : ");
		int nb = stdIn.nextInt();
		
		int[] b = new int[nb];
		
		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		copy(a, b);
		}
}
