package array.quiz;

/*
 * 5개 크기인 int 타입의 배열을 생성하세요.
 * 값목록 초기화한다 { 10, 15, 20, 25, 30 }
 * 포문을 사용하여 배열요소의 합을 구하고 출력한다
 * */
public class Quiz3 {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 15, 20, 25, 30 };
		int sum = 0; //합을 저장할 변수
		
		for(int i=0; i<5; i++){ 
			sum = sum + arr[i];
		} // arr[0] + arr[1] + arr[2] + arr[3] + arr[4]
		
		System.out.println(sum);
	}
}
