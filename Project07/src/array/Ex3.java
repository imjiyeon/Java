package array;

/*
 * 반복문을 이용해서 배열의 요소 출력하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		//배열의 요소를 직접 하나씩 꺼내기
		int[] intArr = new int[3]; //3개 크기의 정수형 배열 생성
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		
		//반복문을 배열의 요소를 하나씩 꺼내기
		for (int i = 0; i < 3; i++) { //i를 인덱스로 사용하여 배열의 요소를 하나씩 출력
			System.out.print(intArr[i]+" "); //정수형의 초기값은 0
		} 
	}
}
