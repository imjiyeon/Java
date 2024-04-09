package array;

/*
 * 2차원 배열 만들기
 * */
public class Ex7 {

	public static void main(String[] args) {

		//2차원 배열 생성 및 초기화
		int[][] arr = {{2,4,6},{3,6,9}};
		//위와 같음
		int[][] arr1 = new int[2][3];
		//첫번째 행은 2,4,6 값을 저장한다
		//두번째 행은 3,6,9 값을 저장한다
		
		//3개의 배열이 생성됨
		//arr; 크기가 2인 1차원 배열을 참조한다
		//arr[0]; 크기가 3인 첫번째 2차원 배열을 참조한다 {2,4,6}
		//arr[1]; 크기가 3인 두번째 2차원 배열을 참조한다 {3,6,9}

		//배열의 요소 출력
		//i는 행 인덱스(0~1) j는 열 인덱스(0~2)
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		//배열의 인덱스를 출력
		for(int i=0; i<arr.length; i++){ //행
			for(int j=0; j<arr[i].length; j++){ //열
				System.out.print("["+i+","+j+"] ");
			}
			System.out.println();
		}
	}

}
