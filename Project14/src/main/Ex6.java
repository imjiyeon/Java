package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 컴파일러가 예외를 체크해주는 경우
 * */
public class Ex6 {

	public static void main(String[] args) {

		// 텍스트 파일을 여는 코드를 작성하면 컴파일러가 예외를 체크함
//		FileInputStream fis = new FileInputStream("src/main/a.txt"); //에러남. 해당 파일이 없으면 오류가 발생할 수 있음
		
//		try {
//			//
//			FileInputStream fis = new FileInputStream("src/main/a.txt");
//		} catch (FileNotFoundException e) { //반드시 예외를 처리해야함
//			System.out.println(e);
//		} 
//		
//		System.out.println("프로그램이 정상 종료됩니다.");
	}

}




