package main;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 배열을 사용해서 파일 읽기
 * */
public class Ex05 {

	public static void main(String[] args) {
		
		// input3.txt 파일 먼저 만들기
		
		try {
			//파일 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input3.txt"); 
			
			//배열 생성
			byte[] arr = new byte[10]; 
			
			//읽어들인 요소의 개수 저장
			int length; 
			
			//read()메소드에 배열 인자 넣기. 데이터를 읽이서 배열에 저장하고 데이터의 크기를 반환
			while ((length = fis.read(arr)) != -1) {
				
				//읽어들인 크기만큼 배열요소를 출력
				for (int i = 0; i < length; i++) {
					System.out.print((char) arr[i]); 
				}
				System.out.println(": " + length + "바이트 읽음");
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
