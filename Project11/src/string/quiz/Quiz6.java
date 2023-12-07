package string.quiz;

import java.util.*;

/*
* Scanner 클래스의 nextLine 메소드를 사용하여 문자열을 입력받고,
* "END" 또는 "end" 가 입력되면 루프를 종료하세요.
*
* while(true)를 사용하여 무한루프를 만드세요.
* */

public class Quiz6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("문장을 입력하세요:");
			String line = sc.nextLine(); // 문자열 입력받기
			
			//1.
			if (line.toLowerCase().equals("end")) { // 문자열이 "END" 또는 "end" 라면 루프 종료
				break;
			}
			
			//2.
			if (line.equalsIgnoreCase("end")) {
				break;
			}
			
			//3.
			if (line.equals("end") || line.equals("END")) {
				break;
			}
			
			//break: 반복문 종료 
			//continue: 반복문 스킵
			
		}
		
	}
}