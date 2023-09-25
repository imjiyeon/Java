package array;

/*
 * 반복문을 이용해서 배열의 모든 요소 출력하기
 * */
public class Ex3 {

	public static void main(String[] args) {

		int[] intArr = new int[3]; //3개 크기의 정수형 배열 생성. 배열의 자료형이 정수형이면 각 요소가 0으로 초기화
		for (int i = 0; i < 3; i++) {
			System.out.print(intArr[i] + " "); //반복문을 사용해서 배열요소를 하나씩 출력
		} 
		System.out.println();
		
		double[] doubleArr = new double[3]; //3개 크기의 실수형 배열 생성. 배열의 자료형이 실수형이면 각 요소가 0.0으로 초기화
		for (int i = 0; i < 3; i++) {
			System.out.print(doubleArr[i] + " ");
		} 
	}
}
