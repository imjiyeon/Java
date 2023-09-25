package main;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 배열을 사용해서 파일 읽기
 * (input3.txt)
 * */
public class Ex05 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("input3.txt"); //파일 입력 스트림 생성
			byte[] arr = new byte[10]; //배열 생성
			int i; //읽어들인 요소의 개수 저장
			
			while ((i = fis.read(arr)) != -1) { //read()메소드에 배열 인자 넣기. 데이터를 읽이서 배열에 저장하고 데이터의 크기를 반환
				for (int k = 0; k < i; k++) { //읽어들인 크기만큼 배열요소를 출력
					System.out.print((char) arr[k]); 
				}
				System.out.println(": " + i + "바이트 읽음");
			}
			
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
