package array;

/*
 * 배열요소를 특정한 값으로 초기화하기
 * */
public class Ex2 {

	public static void main(String[] args) {

		//배열선언과 동시에 각 요소의 값 저장하기
		int[] arr1 = {1,2,3}; //목록의 개수만큼 배열의 크기가 생성됨
		
		//배열을 먼저 선언하고 나중에 값 초기화하기
		int[] arr2; //배열 선언
		arr2 = new int[]{1,2,3}; //배열이 생성되지 않았으므로 new키워드를 생략할 수 없음

	}
}
