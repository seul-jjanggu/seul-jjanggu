package chap01;

import java.util.Scanner;

public class 실습1C_2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리 정수를 입력하세요.");
		
		do {
			System.out.println("입력: ");
			no = stdIn.nextInt();
		} while(no < 10 || no > 99); //no이 10보다 작거나 99보다 크면 do 실행 while(true면) do 실행
		
		System.out.println("변수 no의 값은 " + no +"가(이) 되었습니다.");
	}

}
