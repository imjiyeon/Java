package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 보조스트림 사용하기 (1)
 * */
public class Ex10 {

	public static void main(String[] args) {

		try {
			// FileInputStream 기반스트림 + 내용이 한글일 경우

			// 기반 스트림 생성
			FileInputStream fis = new FileInputStream("reader.txt");

			// 보조스트림 생성
			InputStreamReader isr = new InputStreamReader(fis); 

			// 보조스트림으로 파일 내용 읽기
			while (true) {
				int i = isr.read(); // 바이트 읽은 내용을 문자로 변환하여 가져옴
				if (i == -1) {
					break;
				}
				System.out.print((char) i); // 한글을 제대로 읽음
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
