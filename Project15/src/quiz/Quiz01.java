package quiz;

import java.util.Arrays;
import java.util.Scanner;


//  <Scanner>
//  
//  5개 크기의 정수형 배열을 생성하세요
//  Scanner를 사용하여 배열에 숫자 5개를 입력받으세요
//  그리고 배열의 모든 요소의 합을 구하세요
//
//  (예시)
//  배열: {1,2,3,4,5}
//  합계: 15
  
public class Quiz01 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;

		System.out.println("숫자를 입력하세요.");
		arr[0] = scanner.nextInt();
		arr[1] = scanner.nextInt();
		arr[2] = scanner.nextInt();
		arr[3] = scanner.nextInt();
		arr[4] = scanner.nextInt();

//		for (int i = 0; i < 5; i++) {
//			System.out.println("숫자를 입력하세요.");
//			arr[i] = scanner.nextInt();
//		}
		
		for(int i = 0; i < 5; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("배열:" + Arrays.toString(arr));

		System.out.println("숫자 5개의 합은 " + sum + "입니다");
	}
}
