package array.quiz;

/*
 * 10개 크기의 int 타입의 배열을 생성한다.
 * 값목록 초기화한다 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
 * 첫번째 요소와 마지막 요소를 출력한다
 * 단, 값의 목록이 바뀌었을때도 그대로 첫번째요소와 마지막요소가 출력되어야한다.
 * */

public class Quiz2 {

	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 초기화

		System.out.println(intArray[0]);
		
		int lastIndex = intArray.length - 1; //배열의 마지막 인덱스는 배열크기 - 1 이다
		System.out.println(intArray[lastIndex]);
	}

}
