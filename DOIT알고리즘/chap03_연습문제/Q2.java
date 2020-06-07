package chap03_��������;

import java.util.Scanner;

public class Q2 {
	
	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // �˻�����
		}
		return -1; // �˻�����
	}
//		System.out.print("   |");
//		for (int i = 0; i < n; i++) 
//			System.out.printf("%3d", i);
//		System.out.println("\n---+---------------------------");
//		
//		
//		for (int i1 = 0; i1 < n; i1++) {
//			System.out.print("   |");
//			for(int j = 0; j < n; j++) {
//				System.out.printf("%3d|", i1);
//				System.out.printf("%3d", a[j]);
//			}
//			System.out.printf("\n%3d", "*");
//			
//			if (a[i1] == key)
//				return i1;
//			}
//		return -1;
//	}
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("��ڼ�: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("�˻��� ��: ");
		int ky = stdIn.nextInt();
		int idx = seqSearchEx(x, num, ky);
		
		if	(idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else 
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}
}
