package main;

import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader로 읽기
 * */
public class Ex08 {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("reader.txt"); //문자 기반 입력 스트림 생성

			while(true) {
				int i = fr.read(); //한 문자(2바이트)씩 읽기
				if(i == -1) {
					break;
				}
				System.out.print((char) i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 문자 기반 스트림은 한글도 읽을 수 있다
	 * */
}
