package main;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * <문자 단위 스트림>
 * FileReader로 사용하기
 * */
public class Ex08 {

	public static void main(String[] args) {

		// reader.txt 파일 먼저 만들기

		// 파일 내용 읽어오기
		try {
			FileInputStream fis = new FileInputStream("reader.txt");
			while (true) {
				int i = fis.read(); // 1바이트씩 읽기
				if (i == -1) {
					break;
				}
				System.out.print((char) i); // 한글은 1byte로 표현할 수 없어서 모두 깨짐
			}

			System.out.println();

			// 문자 기반 입력 스트림 생성
			FileReader fr = new FileReader("reader.txt");

			while (true) {
				int i = fr.read(); // 한 문자(2바이트)씩 읽기
				if (i == -1) {
					break;
				}
				System.out.print((char) i); // 한글이 제대로 읽힘
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* 문자 기반 스트림은 한글도 읽을 수 있다 */
}
