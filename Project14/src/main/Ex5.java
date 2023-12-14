package main;

/*
 * 최상위 클래스 Exception 사용하기
 * */
public class Ex5 {

	public static void main(String[] args) {

		int[] arr = new int[5];

		try {
			arr[5] = 5;
		} catch (ClassCastException e) { // 발생한 예외 인스턴스가 매개변수에 저장됨
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) { // Exception형 매개변수를 사용하면, 모든 에러를 처리할 수 있음
			System.out.println(e.getMessage()); // 에러메세지만 출력
			e.printStackTrace(); // 에러가 발생한 위치와 에러메세지를 함께 출력
		}

		System.out.println("프로그램이 정상 종료됩니다.");

	}

}
