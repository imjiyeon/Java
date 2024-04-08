package array;

/*
 * 반복문을 사용하여 배열의 요소를 하나씩 출력하기
 * */
public class Ex3 {

	public static void main(String[] args) {

		// 10개 크기의 정수형 배열 생성
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 배열의 요소를 직접 하나씩 출력하기
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
		System.out.println(intArr[5]);
		System.out.println(intArr[6]);
		System.out.println(intArr[7]);
		System.out.println(intArr[8]);
		System.out.println(intArr[9]);

		// 반복문을 사용하여 배열의 요소를 하나씩 출력하기
		for (int i = 0; i <= 9; i++) { // i를 인덱스로 사용
			System.out.println(intArr[i]);
		}

		// 조건식은 배열의 크기를 바로 알 수 있도록 쓰는 게 좋음
		for (int i = 0; i < 10; i++) {
			System.out.println(intArr[i]);
		}

		// 배열의 길이를 나타낼 때는 length 속성 사용
		System.out.println("배열의 길이:" + intArr.length);
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

	}
}
