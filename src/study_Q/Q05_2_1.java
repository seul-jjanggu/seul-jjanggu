package study_Q;

public class Q05_2_1 {
	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		int big;
		int diff;
		
		if(num1 > num2) {
			big = num1;
			System.out.println("ū ��: " + big);
		}
		else if(num1 < num2) {
		 big = num2;
		 System.out.println("ū ��: " + big);
		}
		if(num1 > num2) {
			diff = num1 - num2;
			System.out.println("����: " + diff);
		}
		else if(num1 < num2) {
			diff = num2 - num1;
			System.out.println("����: " + diff);
		}
	}
}
 //��
//public static void main(String[] args) {
//    int num1 = 50;
//    int num2 = 100;
//    int big;
//    int diff;
//
//    if(num1 > num2)
//        big = num1;
//    else
//        big = num2;
//    
//    System.out.println(big);
//	
//if(num1 > num2)
//        diff = num1 - num2;
//    else
//        diff = num2 - num1;
//    
//    System.out.println(diff);	
//}
//}