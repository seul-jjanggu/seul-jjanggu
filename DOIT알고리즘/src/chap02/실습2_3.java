package chap02;

public class �ǽ�2_3 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = a.clone();
		
		b[3] = 0;
		
		System.out.println("a =");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}	
		System.out.println("\nb =");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" " + b[i]);
		}
	}
}
