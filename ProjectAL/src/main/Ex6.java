package main;

/*
 * 배열
 * Q. 크기가 3인 배열을 생성하고 값 1,2,3을 저장한다.
 * 그리고 배열의 두번째 요소를 출력한다.
 * */
public class Ex6 {

	public static void main(String[] args) {
		
		int arr[] = new int[3]; //arr은 정수 3개를 저장하기 위한 배열이다
		
		arr[0] = 1; //배열의 첫번째 요소에 1을 저장한다
		arr[1] = 2; //배열의 두번째 요소에 2을 저장한다
		arr[2] = 3; //배열의 세번째 요소에 3을 저장한다
		
		System.out.println(arr[1]); //배열의 두번째 요소를 출력한다
	}

}
