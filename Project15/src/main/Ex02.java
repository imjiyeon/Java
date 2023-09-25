package main;

import java.util.Scanner;

/*
 * Scanner로 다양한 값 입력받기
 * */
public class Ex02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Scanner 객체 생성. 표준입력 클래스를 인자로 사용

		System.out.println("이름:");
		String name = scanner.nextLine(); // 문자열 입력받기
		System.out.println("직업:");
		String job = scanner.nextLine(); // 문자열 입력받기
		System.out.println("사번:");
		int num = scanner.nextInt(); // 숫자 입력받기

		System.out.println(name);
		System.out.println(job);
		System.out.println(num);

		scanner.close(); // 사용한 리소스 닫기
	}
}
