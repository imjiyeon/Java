package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *  InputStream 사용하기
 * */
public class Ex03 {

	public static void main(String[] args) {

		// input.txt 파일 만들고 내용 작성하기

		// InputStream형 변수 선언
		FileInputStream fis = null;

		try {
			// 텍스트파일과 연결된 입력 스트림 생성
			fis = new FileInputStream("input.txt");
			
			//문자 하나씩 읽어오기
			System.out.println(fis.read()); // 65
			System.out.println(fis.read()); // 66
			System.out.println(fis.read()); // 67
			
			System.out.println();

			// 입력 스트림 다시 생성
			fis = new FileInputStream("input.txt"); 
			
			// 아스키코드를 문자로 변환하여 출력
			System.out.println((char) fis.read()); // A
			System.out.println((char) fis.read()); // B
			System.out.println((char) fis.read()); // C
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
