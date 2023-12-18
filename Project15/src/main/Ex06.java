package main;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * <바이트 단위 스트림>
 * FileOutputStream 사용하기
 * */
public class Ex06 {

	public static void main(String[] args) {
		
		try {
			//만약 파일이 없다면 파일을 생성함
			FileOutputStream fos = new FileOutputStream("output.txt"); //파일 출력 스트림 생성
			
			byte a = 65; //65->A 문자로 변환되어 저장됨
			byte b = 66;
			
			fos.write(a); //1바이트씩 파일에 저장
			fos.write(b);  
			fos.write('C'); //그대로 저장됨
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	//프로젝트를 새로고침하여 파일이 생겼는지 확인하기 (Refresh 메뉴 또는 F5키) 
}
