package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * finally문 사용하기
 * */
public class Ex7 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/main/a.txt");	
			System.out.println("a.txt 파일을 엽니다");
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		}  finally {  //finally 블록은 예외 발생여부와 상관없이 항상 수행됨
			if(fis != null) {
				// 사용한 리소스를 항상 사용이 끝나면 닫아야 함
				// fis.close(); //해당코드도 예외처리를 해야함 
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("사용한 리소스를 닫았습니다");
			
		}
	}

}





