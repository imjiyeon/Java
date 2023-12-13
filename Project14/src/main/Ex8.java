package main;

/*
 * 예외처리 미루기
 * */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex8 {

	// open메소드를 사용하는 쪽에 예외처리 넘기기
	public static void openTextFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("src/main/a.txt");
	}

	public static void main(String[] args) {

		try {
			openTextFile(); // 메소드를 호출하는 쪽에서 예외 처리를 해야함
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}

	}

}
