package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 보조스트림 사용하기
 * */
public class Ex10 {

	public static void main(String[] args) {

		try {
			// FileInputStream 기반스트림 + 내용이 한글일 경우

			// 기반 스트림 생성
			FileInputStream fis = new FileInputStream("reader.txt");

			// 보조스트림 생성
			InputStreamReader isr = new InputStreamReader(fis);

			// 보조스트림으로 파일 읽기
			int i;
			while ((i = isr.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// FileInputStream은 1 바이트 단위로 데이터를 읽지만, 
		// 보조스트림을 사용하면 2 바이트 문자도 읽을 수 있다

	}
}
