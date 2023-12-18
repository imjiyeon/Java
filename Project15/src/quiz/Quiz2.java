package quiz;

import java.util.Scanner;

/*
 * <Scanner>
 * 
 * Scanner를 사용하여 두자리 정수(10~99)를 입력받으세요. 
 * 십의자리와 일의자리의 합을 구하세요.
 * */

public class Quiz2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int i = scanner.nextInt();

		int num1 = i / 10; // 십의자리
		
		int num2 = i % 10; // 일의자리

		int sum = num1 + num2;

		System.out.println("십의자리와 일의자리의 합은 " + sum + "입니다");
	}
}
