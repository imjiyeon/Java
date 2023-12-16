package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 파일 끝까지 읽기
 * */
public class Ex04 {

	public static void main(String[] args) {

		try {
			// 텍스트 파일과 연결된 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input.txt");

			// 파일의 내용을 읽다가 파일의 끝에 도달하면 반복문 종료
			while (true) {
				int i = fis.read(); // 1바이트씩 읽기
				if (i == -1) { // 파일의 끝에 도달하면 -1을 반환
					break;
				}

				// 문자로 변환하여 출력
				System.out.println((char) i);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

		// input2.txt을 만든다.
		// 다시 파일을 읽는다.
		// 바이트 파일 스트림은 한글을 읽으면 깨지는 것을 확인

	}
}
