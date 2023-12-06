package string.quiz;

import java.util.Scanner;

/*
 * Scanner 클래스의 nextLine 메소드를 사용하여 문자열을 입력받고,
 * 문자열을 거꾸로 뒤집어서 출력하세요.
 * 
 * ex) "안녕하세요" -> "요세하녕안"
 * */
public class Quiz5 {

	public static void main(String[] args) {

		// 문자열 입력받기
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine(); 

		// 1.문자열에서 뒤에서부터 한 글자씩 출력
		for (int i = str.length() - 1; i >= 0; i--) { // 1씩 감소
			System.out.print(str.charAt(i));
		}

		// 2.StringBuilder 클래스 사용
		StringBuilder builder = new StringBuilder(str);
		builder.reverse(); //문자열을 거꾸로 변경하기
		System.out.println(builder.toString());

	}

}
