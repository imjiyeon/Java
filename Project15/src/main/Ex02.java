package main;

import java.util.Scanner;

/*
 * Scanner로 다양한 값 입력받기
 * */
public class Ex02 {

	public static void main(String[] args) {

		// Scanner 객체 생성
		// 표준입력 클래스를 인자로 사용 (화면에서 입력을 받겠다는 뜻) -> 입출력 대상을 지정하는 것
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름:");
		String name = scanner.nextLine(); // 문자열 입력받기
		
		System.out.println("나이:");
		int age = scanner.nextInt(); // 숫자 입력받기

		System.out.println(name);
		System.out.println(age);

		scanner.close(); // 사용한 리소스 닫기
		
	}
}
