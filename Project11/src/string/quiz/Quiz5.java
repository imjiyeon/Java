package string.quiz;

import java.util.*;

/*
* Scanner의 nextLine 메소드를 사용하여 문자열을 계속 입력받다가
* 만약 "END"라는 문장이 입력되면 루프에서 빠져나와 프로그램을 종료하도록 구현하세요.
* 
* 단, end의 대소문자에 상관없이 종료해야 합니다 
* */

public class Quiz5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("문장을 입력하세요:");
			String line = sc.nextLine();
			if (line.toUpperCase().equals("END")) { // 입력문장이 "END" 이면 종료
				break;
			}
		}
	}
}