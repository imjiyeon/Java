package array;

import java.util.Arrays;

/*
 * 배열의 속성 사용하기
 * */
public class Ex4 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; //10개 크기의 정수형 배열 생성		
		//반복문을 사용해서 배열의 요소 출력하기
		for (int i = 0; i < 10; i++) { //조건 i<=9 대신 i<10을 사용함. 배열의 크기가 명시적으로 보임
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) { //length는 배열의 길이를 나타냄
			System.out.print(arr[i] + " ");
		}
	}
}
