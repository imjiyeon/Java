package array.quiz;

/*
 * 5개 크기의 정수형배열을 생성하고 값을 5, 20, 100, 30, 77으로 초기화 하세요
 * 그리고 배열에서 가장 큰값을 구하세요
 * */
public class Quiz5 {

	public static void main(String[] args) {
		int[] arr = new int[] {5, 20, 100, 30, 77};	
		int max; //최대값을 저장하기 위한 변수
		max = arr[0]; //배열의 첫번째 값으로 최대값을 초기화	
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) { //배열의값이 현재 최대값보다 크다면
				max = arr[i]; //최대값을 변경
			}
		}
		
		System.out.println(max);
	}
}
