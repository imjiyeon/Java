package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *  FileInputStream 사용하기
 * */
public class Ex03 {

	public static void main(String[] args) {

		// input.txt 파일 먼저 만들기

		// FileInputStream 클래스 생성과 read()메소드는 에러가 발생할 수 있으므로 예외처리 필요
		FileInputStream fis = null;

		try {
			// input.txt파일과 연결된 입력 스트림 생성
			fis = new FileInputStream("input.txt");
			System.out.println(fis.read()); // 65
			System.out.println(fis.read()); // 66
			System.out.println(fis.read()); // 67

			fis = new FileInputStream("input.txt"); // 입력 스트림 다시 생성
			System.out.println();
			System.out.println((char) fis.read()); // A. int->char
			System.out.println((char) fis.read()); // B
			System.out.println((char) fis.read()); // C
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
