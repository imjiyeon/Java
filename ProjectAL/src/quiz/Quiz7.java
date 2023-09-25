package quiz;

/*
 * <배열>
 * 크기가 5인 배열에 10,5,1,30,15 를 저장한다 
 * 그리고 값 15가 저장된 위치를 찾는다 (index: 4)
 * */
public class Quiz7 {

	public static void main(String[] args) {
		
		int arr[] = {10, 5, 1, 30, 15}; //arr은 정수 5개를 저장하기 위한 배열이다
		
		for(int i=0;i<5;i++) {
			if(arr[i] == 15) { //현재 배열값이 15와 같은지 비교한다
				System.out.println(i); //인덱스 i를 출력한다
			}
		}
	}

}
