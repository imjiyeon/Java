package array;

/*
 * 람다식 포문 사용하기
 * */
public class Ex4 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 람다식 포문을 사용하면 반복문은 간결하게 쓸 수 있음
		// 람다식 포문은 배열을 순회하면서 요소를 하나씩 꺼냄
		// (배열에서 꺼낸 값을 저장할 변수 : 배열)
		// 람다식 포문
		for (int value : arr) {
			System.out.print(value + " ");
		}

		System.out.println();

		// 기존 포문
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
