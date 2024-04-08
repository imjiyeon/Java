package array.quiz;

import java.util.Arrays;

//  System.arraycopy 메소드를 사용하여 배열을 복사하세요.
//
//  원본배열: {'a', 'b', 'c', 'd', 'e'}
//  새배열: {'d', 'e'}

public class Quiz7 {

	public static void main(String[] args) {
		// 원본배열
		char[] srcArr = { 'a', 'b', 'c', 'd', 'e' };
		// 새로운배열
		char[] newArr = new char[2];

		// 배열 복사하기
		// 원본배열, 시작위치, 새배열, 시작위치, 개수
		System.arraycopy(srcArr, 3, newArr, 0, 2);

		System.out.println("원본배열: " + Arrays.toString(srcArr));

		System.out.println("새로운배열: " + Arrays.toString(newArr));
	}
}
