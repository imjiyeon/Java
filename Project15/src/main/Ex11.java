package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 보조스트림 사용하기 (2)
 * - 기반스트림으로 파일 복사하기
 * */
public class Ex11 {

	public static void main(String[] args) {
		
		// 먼저 예제 프로젝트에서 a.txt 파일 복사 (용량이 2MB 정도되는 파일 준비)

		long start = 0;
		long end = 0;
		
		try {

			//파일 입력 스트림 생성
			FileInputStream fis = new FileInputStream("a.txt"); 
			//파일 출력 스트림 생성
			FileOutputStream fos = new FileOutputStream("copy.txt"); 
			
			//복사 되는 시간 측정하기
			
			//복사를 시작하는 시간 저장
			start = System.currentTimeMillis(); 
			
			//한문자씩 읽어서 복사하는 중
			int i;
			while ((i = fis.read()) != -1) { 
				fos.write(i);
			}
			
			//복사가 끝나는 시간 저장
			end = System.currentTimeMillis(); 
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사하는 데 " + (end - start) + " milliseconds 소요되었습니다.");
	}
}
