package main;

/*
 * 예외처리를 미루는 throws 사용하기
 * */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex8 {
	
	public static void openTextFile() throws FileNotFoundException { //예외를 던질 수 있음을 표시
		FileInputStream fis = new FileInputStream("src/main/a.txt"); //예외 처리 필요	
	}

	public static void main(String[] args) {
		
		try {
			openTextFile();	//메소드를 호출하는 쪽에서 예외를 처리해야함
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}

	}
	
}




