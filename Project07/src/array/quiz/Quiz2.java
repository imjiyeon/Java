package array.quiz;

/*
 * 10개 크기의 정수형 배열을 생성하세요.
 * 값의 목록을 다음과 같이 초기화하세요 { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }
 * 첫번째 요소와 마지막 요소를 출력하세요.
 * 단, 값의 목록이 바뀌었을때도 첫번째요소와 마지막요소가 출력되어야합니다.
 * 
 * 예시) { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } -> 1과 10
 * 예시) { 1, 2, 3, 4, 5, 6, 7, 8, 9, 50 } -> 1과 50
 * */
public class Quiz2 {

	public static void main(String[] args) {
		int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 초기화

		System.out.println(intArray[0]);
		
		int lastIndex = intArray.length - 1; //배열의 마지막 인덱스는 배열크기 - 1 이다
		System.out.println(intArray[lastIndex]);
	}

}

//문제풀이 : 인덱스 규칙을 알고있는지 확인
