package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 보조스트림을 사용해서 파일 복사하기
 * */
public class Ex12 {

	public static void main(String[] args) {
		
		long start = 0;
		long end = 0;
		
		try {		
			FileInputStream fis = new FileInputStream("a.txt"); //기반 스트림 생성
			FileOutputStream fos = new FileOutputStream("copy2.txt"); //기반 스트림 생성
			
			BufferedInputStream bis = new BufferedInputStream(fis); //버퍼링 보조스트림 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos); //버퍼링 보조스트림 생성
			
			// 복사 시간 측정하기
			start = System.currentTimeMillis(); //복사 시작 시간
			int i;
			while ((i = bis.read()) != -1) { //8kb를 한꺼번에 읽어서 복사하는 중
				bos.write(i);
			}
			end = System.currentTimeMillis(); //복사 종료 시간
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사하는 데 " + (end - start) + " milliseconds 소요되었습니다.");
	}
	
	/*
	 * 보조스트림을 사용하면 성능이 향상된다
	 * */
}
