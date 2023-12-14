package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 컴파일러가 예외를 체크해주는 경우
 * */
public class Ex6 {

	public static void main(String[] args) {

		// FileInputStream: 파일을 열어서 읽고 쓰는 입력 클래스
		// 파일을 열 때, 파일이 위치에 없으면 오류가 발생할 수 있음

//		FileInputStream fis = new FileInputStream("src/main/a.txt"); 
		
		// FileInputStream 클래스를 사용하면 컴파일러가 예외처리를 했는지 체크하기 때문에,
		// 예외처리를 반드시 해야함
				
		// 1. 코드를 쓴다
		// 2. surround with try/catch 옵션을 선택하면 예외처리를 자동완성한다
//		try {
//			FileInputStream fis = new FileInputStream("src/main/a.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("프로그램이 정상 종료됩니다.");	
		
	}

}
