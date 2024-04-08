package array;

import java.util.Arrays;

/*
 * 람다식 포문 사용하기
 * */
public class Ex4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 람다식 포문을 사용하면 반복문은 간결하게 쓸 수 있음
		// 람다식 포문은 배열을 순회하면서 요소를 하나씩 꺼냄
		// (배열에서 꺼낸 값을 저장할 변수 : 배열)
		for (int value : arr) {
			System.out.print(value + " ");
		}
//		System.out.println();
//
//		// 배열의 요소를 한번에 출력
//		System.out.println(arr); // arr은 참조변수이므로 주소가 출력됨
//		System.out.println(Arrays.toString(arr)); // Arrays 클래스의 메소드 사용
	}
}
