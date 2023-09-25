package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 반복문을 사용해서 파일 읽기
 * (input.txt, input2.txt)
 * */
public class Ex04 {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("input.txt"); //파일 입력 스트림 생성
		
			while(true) {
				int i = fis.read(); //1바이트씩 읽기
				if(i == -1) { //파일의 끝에 도달하면 반복문 종료
					break;
				}
				System.out.println((char) i); //문자 하나씩 출력
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
		/*
		 * input2.txt를 생성하고 파일을 읽는다
		 * 바이트 파일 스트림은 한글을 읽으면 깨진다
		 * */
	}
}
