package quiz;

import java.util.Scanner;

/*
 * <배열>
 * 크기가 5인 배열을 생성한다
 * Scanner 클래스를 사용하여 배열에 숫자 5개를 입력받는다
 * 배열에 저장된 모든 숫자의 합을 구한다
 * */
public class Quiz6 {

	public static void main(String[] args) {	
		
		int sum = 0; //sum은 결과를 저장하기 위한 변수이다 
		int arr[] = new int[5]; //arr은 정수 5개를 저장하기 위한 배열이다
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<5;i++) { 
			arr[i] = scanner.nextInt(); //배열의 i번째 위치에 값을 저장한다
		}
		
		for(int i=0;i<5;i++) {
			sum = sum + arr[i]; //배열 요소를 꺼내서 sum에 더한다
		}
		
		System.out.println(sum); //sum을 출력한다
	}

}
