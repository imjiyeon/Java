package array.quiz;

/*
 * 5개 크기의 정수형 배열을 생성하세요.
 * 값의 목록을 다음과 같이 초기화하세요 {5, 20, 100, 30, 77}
 * 20이 저장되어있는 요소의 인덱스를 찾아서 출력하세요.
 * */
public class Quiz6 {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 20, 100, 30, 77 };
		int findIndex = 0; //인덱스를 저장하기위한 변수

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 20) { //배열의 값이 20이라면
				findIndex = i; //배열의 인덱스를 저장
			}	
		}
		
		System.out.println("배열에서 값20을 가지는 요소의 인덱스는 " + findIndex + " 입니다");
	}
}
