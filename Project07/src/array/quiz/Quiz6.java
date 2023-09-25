package array.quiz;

/*
 * 5개 크기의 정수형배열을 생성하고 값을 5, 20, 100, 30, 77으로 초기화 하세요
 * 그리고 배열에서 값 20이 저장되어있는 요소의 인덱스를 찾아서 출력하세요
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
