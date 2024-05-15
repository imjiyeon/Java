package quiz;

import java.util.Scanner;

/*
 * <Scanner>
 * 
 * Scanner를 사용하여 배열에 숫자 5개를 입력하세요.
 * 배열의 모든 요소의 합을 구하세요
 * */

public class Quiz01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("숫자를 입력하세요.");
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < 5; i++) {
			sum = sum + arr[i];
		}

		System.out.println("숫자 5개의 합은 " + sum + "입니다");
	}
}
