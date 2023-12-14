package main;

/*
 * 예외처리 미루기
 * */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex8 {

	// open메소드를 사용하는 쪽에 예외처리 넘기기
	public static void openTextFile() throws FileNotFoundException  {
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

// 1.openTextFile메소드 선언하고 안에 스트림 생성 코드 넣기
// 2.예외처리 옵션에서 첫번째 옵션 선택
// -> 이렇게 하면 예외처리를 여기서 하지 않고, 메소드를 사용하는 쪽에 넘기겠다는 뜻
// 3.메인함수에서 openTextFile() 함수 호출
// 4.예외처리를 하라는 메세지가 뜸
// 5.여기서 try-catch로 예외처리 해주면 됨
