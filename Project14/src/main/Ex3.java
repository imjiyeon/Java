package main;

/*
 * try-catch문으로 예외처리하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		try {		
			arr[5] = 5; // 예외가 발생할 가능성이 있는 코드 작성

			// 에러가 발생됬을 때 에러 객체를 매개변수로 받음
		} catch (IndexOutOfBoundsException e) { // 예외 클래스 변수를 매개변수로 선언	
			System.out.println(e); // 예외가 발생하면 처리할 코드 작성
			
		}

		System.out.println("프로그램이 정상 종료됩니다."); // 에러가 나도 마지막 문장이 실행됨

	}

	// <예외 처리 과정>
	// 1.예외가 발생한다
	// 2.일치하는 catch 블록을 찾는다.
	// 3.catch블록의 코드를 실행한다
	// 4.다음 문장을 계속해서 실행한다

}
