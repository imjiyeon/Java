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
			//기반 스트림 생성
			FileInputStream fis = new FileInputStream("a.txt");
			FileOutputStream fos = new FileOutputStream("copy2.txt"); 
			
			//버퍼링 보조스트림 생성
			BufferedInputStream bis = new BufferedInputStream(fis); 
			BufferedOutputStream bos = new BufferedOutputStream(fos); 
			
			// 복사 시간 측정하기
			start = System.currentTimeMillis();
			
			//8kb를 한꺼번에 읽어서 복사하는 중
			int i;
			while ((i = bis.read()) != -1) { 
				bos.write(i);
			}
			
			end = System.currentTimeMillis();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사하는 데 " + (end - start) + " milliseconds 소요되었습니다.");
	}
	
	/*
	 * 보조스트림을 사용하면 성능이 향상된다
	 * */
}
