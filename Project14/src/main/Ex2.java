package main;

/*
 * 런타임 오류 발생시키기
 * */
public class Ex2 {

	public static void main(String[] args) {

		int[] arr = new int[5];
		arr[5] = 5; // index 범위를 벗어남

		// 에러가 발생하면 프로그램이 갑자기 종료됨

		System.out.println("프로그램이 정상 종료됩니다."); // 마지막 문장 실행 안됨

	}

}
