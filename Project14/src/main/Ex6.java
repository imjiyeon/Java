package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 컴파일러가 예외를 체크해주는 경우
 * */
public class Ex6 {

	public static void main(String[] args) {

		// 텍스트 파일 열기
//		FileInputStream fis = new FileInputStream("src/main/a.txt"); 

		// FileInputStream 클래스를 사용하면 컴파일러가 예외처리를 했는지 체크함
		// 파일을 열 때, 파일이 없으면 오류가 발생할 수 있기 때문에 예외처리를 해야함

//		try {
//			//
//			FileInputStream fis = new FileInputStream("src/main/a.txt");
//		} catch (FileNotFoundException e) { //반드시 예외를 처리해야함
//			System.out.println(e);
//		} 

	}

}
