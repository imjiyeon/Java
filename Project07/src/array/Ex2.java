package array;

/*
 * 배열 사용하기
 * */
public class Ex2 {

	public static void main(String[] args) {

		// 3개 크기의 정수형 배열 생성
		int[] arr = new int[3];

		arr[0] = 10; // 배열의 첫번째 요소에 10 저장
		arr[1] = 20; // 배열의 두번째 요소에 20 저장
		arr[2] = 30; // 배열의 세번째 요소에 30 저장
		// arr[3] = 40; //에러남. 배열의 길이를 벗어나는 index를 사용함
		
		int value = arr[1]; // 배열의 두번째 요소값을 가져와서 value에 저장
		System.out.println(value);

	}
}

// 디버깅 필요