package D0414_class_after;
public class ContinueBasic {
	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if(((num % 5) != 0) || ((num % 7) != 0))
//			if(((num % 5) == 0) || ((num % 7) == 0)) ������� ����.
				continue; //5 �Ǵ� 7�� ����� �ƴ϶�� �ٽ� �ǳʶٰ� ���� �̵�.
			count++; // 5�� 7�� ����� ��츸 ����.
			System.out.println(num);
		}
		System.out.println("count: " + count);
	}
}
