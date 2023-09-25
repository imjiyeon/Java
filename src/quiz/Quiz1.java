package quiz;

import java.util.Scanner;

/*
 * Scanner 클래스를 사용하여 "STOP"이 입력될 때까지 문자열을 계속 입력받습니다.
 * 그리고 "STOP"의 대소문자 구분 없이 입력된 경우에도 종료됩니다.
 * */

public class Quiz1 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자를 입력하세요:");
			String str = scanner.nextLine();
			if(str.toUpperCase().equals("STOP")) {
				break;
			}
		}
		
		System.out.println("프로그램이 종료되었습니다");
	}
}
