package array;

/*
 * 배열 선언하고 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		//숫자 3개를 저장하기 위해 변수 3개를 만든다
		int num1;
		int num2;
		int num3;
		num1 = 10;
		num2 = 20;
		num3 = 30;

		int[] arr = new int[3]; //3개 크기의 정수형 배열을 생성한다
		arr[0] = 10; //배열의 첫번째 요소에 값 10을 저장한다
		arr[1] = 20; //배열의 두번째 요소에 값 20을 저장한다
		arr[2] = 30; //배열의 세번째 요소에 값 30을 저장한다
		int value = arr[1]; //배열의 두번째 요소값을 가져와서 value에 저장한다
		
		//arr[3] = 40; //에러남. 배열 길이를 벗어나는 index를 사용했다
	}
}
