package quiz;

import java.util.Scanner;

/*
 * <Scanner>
 * 
 * 무한루프를 사용하여 문자열을 계속 입력 받습니다.
 * 문자열을 입력받다가 "STOP"이 입력되면 루프를 종료하세요.
 * 단, "STOP"의 대소문자는 구분하지 않습니다.
 * */

public class Quiz03 {

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
