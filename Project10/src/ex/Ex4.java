package ex;

import java.util.Scanner;

/*
 * 연습문제 풀기 전에 Scanner 클래스 사용하기
 * */
public class Ex4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt(); // 숫자를 입력받는 메소드 사용하기 (숫자 입력 + 엔터)

		System.out.println(num);

	}
}
