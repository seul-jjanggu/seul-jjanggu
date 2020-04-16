package D0414_class_after;
public class ContinueBasic {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if(((num % 5) != 0) || ((num % 7) != 0))
//			if(((num % 5) == 0) || ((num % 7) == 0)) 실행되지 않음.
				continue; //5 또는 7의 배수가 아니라면 다시 건너뛰고 위로 이동.
			count++; // 5와 7의 배수인 경우만 실행.
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}
}
