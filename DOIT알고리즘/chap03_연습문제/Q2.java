package chap03_연습문제;

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
				return i; // 검색성공
		}
		return -1; // 검색실패
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
		System.out.print("요솟수: ");
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = stdIn.nextInt();
		}
		System.out.print("검색할 값: ");
		int ky = stdIn.nextInt();
		int idx = seqSearchEx(x, num, ky);
		
		if	(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else 
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}
}
