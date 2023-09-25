package array;

import java.util.Arrays;

/*
 * 배열 초기화하고 출력하기
 * */
public class Ex4 {

	public static void main(String[] args) {
		//10개 크기의 정수형 배열 생성하고 동시에, 배열요소를 값 1~10으로 초기화
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; 
		
		System.out.print(arr[0]);
		System.out.print(arr[1]);
		System.out.print(arr[2]);
		System.out.print(arr[3]);
		System.out.print(arr[4]);
		System.out.print(arr[5]);
		System.out.print(arr[6]);
		System.out.print(arr[7]);
		System.out.print(arr[8]);
		System.out.print(arr[9]);
		
		//반복문을 사용해서 배열요소를 하나씩 출력. 인덱스 시작번호 0 ~ 인덱스마지막번호 9 까지 10번 반복함
		for (int i = 0; i < 10; i++) { //조건문 i<=9 대신 i<10을 사용. 배열의 크기(10)이 명시적으로 볼수있음
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//배열은 객체이기 때문에 속성을 가질수 있음. 배열의 길이만큼 반복할때는 length속성을 사용함
		for (int i = 0; i < arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//java가 발전되면서 포문을 간략하게 사용할 수 있음(람다식 포문)
		//(배열에서 꺼낸 값을 저장할 변수 : 배열)
		for (int i : arr) { //배열 요소를 순서대로 가져와서 i에 저장함. 배열의 개수만큼 반복
			System.out.print(i + " ");
		} 

		//Arrays 클래스를 사용하여 배열요소 출력
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}
}
