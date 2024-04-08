package array.quiz;

import java.util.Arrays;

//  5개 크기의 정수형 배열을 생성하세요
//  반복문을 사용하여 숫자 1~10 중에서 짝수만 배열에 저장하세요.
//  {2 4 6 8 10}

public class Quiz4 {

	public static void main(String[] args) {
		// 1~10 중에서 짝수 찾기
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0) {
//				System.out.print(i + " ");
//			}
//		}
//		System.out.println();

		int[] arr = new int[5];

		System.out.println(Arrays.toString(arr));

		int cnt = 0; // 인덱스를 저장할 변수

		// i는 1~10이 되므로, 인덱스로 사용할 수 없음.
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // i가 짝수라면 배열에 저장
				arr[cnt] = i;
				cnt++; // 0~4
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
