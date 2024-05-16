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
			// 보조스트림을 사용해서 한글 읽어오기
			// FileInputStream 바이트 기반 스트림 + InputStreamReader 보조스트림

			// 기반 스트림 생성
			FileInputStream fis = new FileInputStream("reader.txt");

			// 보조스트림 생성
			InputStreamReader isr = new InputStreamReader(fis); // 인자로 기반스트림 넣기

			// 보조스트림으로 파일 내용 읽기
			while (true) {
				int i = isr.read(); // 내용을 문자(2byte)로 변환하여 가지고옴
				if (i == -1) {
					break;
				}
				System.out.print(i + " "); //50504 45397 54616 49464 50836 
			}
			System.out.println();
			
			FileInputStream fis2 = new FileInputStream("reader.txt");
			InputStreamReader isr2 = new InputStreamReader(fis2);
			
			while (true) {
				int i = isr2.read();
				if (i == -1) {
					break;
				}
				System.out.print((char) i); // 문자로변환 (안녕하세요)
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
