package array;

/*
 * 배열 선언과 초기화
 * */
public class Ex1 {

	public static void main(String[] args) {

		// 3개 크기의 정수형 배열 생성
		int[] arr = new int[3]; // 정수는 0으로 초기화됨

		// 생성하고 바로 특정 값으로 초기화
		int[] arr2 = { 1, 2, 3 }; // 요소의 개수만큼 배열의 크기가 결정됨

		int[] arr3; // 배열 선언
		arr3 = new int[] { 1, 2, 3 }; // 배열 생성 및 초기화
		// 선언과 초기화를 따로하는 경우에는 new키워드를 생략할 수 없음
	}
}

// 디버깅 필요
