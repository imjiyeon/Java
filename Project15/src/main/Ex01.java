package main;

import java.io.IOException;

/*
 * 표준입력으로 화면에서 문자 하나 입력받기
 * */
public class Ex01 {
	
	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");

		try {
			
			int i = System.in.read(); // 화면에서 입력이 들어오기를 기다림 -> 입력이 들어오면 변수에 값을 대입함

			System.out.println(i); // read()는 바이트를 읽어들여서 숫자로 저장함. 그래서 문자를 아스키코드로 저장 
			System.out.println((char) i); // 문자로 사용하려면 형 변환해야함

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
