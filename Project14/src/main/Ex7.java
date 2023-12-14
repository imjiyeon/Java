package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * finally문 사용하기
 * */
public class Ex7 {

	public static void main(String[] args) {

		// 스트림 변수 선언
		FileInputStream fis = null;

		// 텍스트파일을 열고 예외 처리
		try {
			fis = new FileInputStream("src/main/a.txt");
			System.out.println("a.txt 파일을 엽니다");

			// 중간에 숫자를 나누는 코드를 삽입
			int i = 0 / 0; // ArithmeticException 에러 발생 -> 리소스를 닫는 코드가 실행 안됨

			// 파일을 사용하고 나서 스트림을 닫아야 함
			try {
				fis.close();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			System.out.println("사용한 리소스를 닫았습니다");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();

			try {
				fis.close();
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			System.out.println("사용한 리소스를 닫았습니다");
		}

//		// finally문을 사용하여 변경
//		FileInputStream fis = null;
//
//		try {
//
//			fis = new FileInputStream("src/main/a.txt");
//			System.out.println("a.txt 파일을 엽니다");
//
//			int i = 0 / 0;
//
//		} catch (FileNotFoundException fileNotFoundException) {
//			fileNotFoundException.printStackTrace();
//			
//		} catch (ArithmeticException arithmeticException) {
//			arithmeticException.printStackTrace();
//			
//		} finally { // finally 블록은 예외 발생여부와 상관없이 항상 수행됨
//			// 스트림 닫기
//			try {
//				fis.close();
//			} catch (IOException exception) {
//				exception.printStackTrace();
//			}
//			System.out.println("사용한 리소스를 닫았습니다");
//		}

	}

}

// 작성 순서 
// 스트림 열기 -> 파일에러 예외처리 -> 스트림 닫기 
// : 파일이 열리고 리소스가 닫히는 지 확인 (파일이름 변경X)
// 중간에 int i = 0 / 0; 코드 삽입 -> ArithmeticException 에러 처리
// : ArithmeticException 에러 발생시 스트림이 안 닫히는 문제 발생!
// ArithmeticException catch 블록 안에도 스트림을 닫는 코드 삽입
// 이렇게 스트림을 쓰는 경우에는 finally를 사용하여 스트림을 닫아야 함
// finally 문추가
// : 이러면 코드를 중복해서 쓸 필요 없음

