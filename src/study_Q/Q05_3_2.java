package study_Q;

public class Q05_3_2 {

	public static void main(String[] args) {
		int n = 24;
		
		switch(n / 10) {
        case 0:
            System.out.println("0�̻� 10�̸��� ��");
            break;
        case 1:
            System.out.println("10�̻� 20�̸��� ��");
            break;
        case 2:
            System.out.println("20�̻� 30�̸��� ��");
            System.out.println(n);
            break;
        default:
            System.out.println("���� Ȥ�� 30 �̻��� ��");
      
    //�� �� 
//		switch(n) {
//		case (n >=0 && n < 10)
		}
	}
}
