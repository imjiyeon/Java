package array.quiz;

import java.util.Arrays;

/*
 * 5개 크기의 정수형 배열을 생성하고, 1~10 중 짝수만 저장하세요.
 * 답: 2 4 6 8 10
 * */
public class Quiz4 {

	public static void main(String[] args) {
//		//1~10 중에서 짝수 찾기
//		for(int i=1; i<=10; i++){
//			if(i%2==0) {
//				System.out.print(i+" ");
//			}	
//		}
//		System.out.println();

		int[] arr = new int[5];
		System.out.println(Arrays.toString(arr));
		int cnt = 0; //인덱스를 저장할 변수
		
		//10번 반복수행을 해야하기 때문에 i는 인덱스로 사용할 수 없음.
		for(int i=1; i<=10; i++){ //i는 짝수를 찾는 변수
			if(i%2==0) { //i가 짝수라면
				arr[cnt]=i; //배열에 저장
				cnt++; //0~4
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
