package main;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * <문자 단위 스트림>
 * FileReader 사용하기
 * */
public class Ex08 {

	public static void main(String[] args) {

		// reader.txt 파일 먼저 만들기

		// 파일 내용 읽어오기
		try {
			// 바이트 입력 스트림 생성
			FileInputStream fis = new FileInputStream("reader.txt");
			while (true) {
				int i = fis.read(); // 1바이트씩 읽기
				if (i == -1) {
					break;
				}
				System.out.print((char) i); // 한글은 1byte로 표현할 수 없어서 모두 깨짐
			}

			System.out.println();

			// 문자 입력 스트림 생성
			FileReader fr = new FileReader("reader.txt");

			while (true) {
				int i = fr.read(); // 2바이트씩 읽기
				if (i == -1) {
					break;
				}
				System.out.print((char) i); // 한글이 제대로 읽어옴
			}
			
			// 한글을 읽을 때는 문자 스트림 사용하기!

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
