package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 반복문을 사용해서 파일 읽기
 * (input.txt, input2.txt)
 * */
public class Ex04 {

	public static void main(String[] args) {

		try {
			// 파일 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input.txt");

			// 1바이트씩 읽다가 파일의 끝에 도달하면 반복문 종료
			while (true) {
				int i = fis.read();
				if (i == -1) {
					break;
				}

				// 문자 하나씩 출력
				System.out.println((char) i);
			}

		} catch (IOException e) {
			System.out.println(e);
		}

		/* input2.txt을 만든다. */
		/* 다시 파일을 읽는다. */
		/* 바이트 파일 스트림은 한글을 읽으면 깨진다 */

	}
}
