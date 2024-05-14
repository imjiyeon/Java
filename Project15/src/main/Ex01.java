package main;

import java.io.IOException;

/*
 * 표준 입출력 사용하기
 * */
public class Ex01 {

	public static void main(String[] args) {

		// 1.표준 출력으로 화면에 내용 출력하기
		System.out.println("안녕하세요");

		// 2.표준 입력으로 문자 입력받기
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

		try {

			// 문자를 입력받아 변수에 값을 저장
			int i = System.in.read(); // a 입력

			// read() 메소드는 입력되 데이터를 바이트 값으로 저장함.
			// 그래서 문자를 아스키코드로 변환함
			System.out.println(i); // a->97

			// 문자로 사용하려면 형 변환 필요

			System.out.println((char) i);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
