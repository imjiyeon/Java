package array;

/*
 * 배열 선언하고 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		//숫자 3개를 저장하기 위해 변수 3개 선언
		int num1;
		int num2;
		int num3;
		num1 = 10;
		num2 = 20;
		num3 = 30;
		//숫자 3개를 저장하기 위해 배열 생성
		int[] arr = new int[3]; //3개 크기의 정수형 배열 생성
		arr[0] = 10; //배열의 첫번째 요소에 값 10 저장
		arr[1] = 20; //배열의 두번째 요소에 값 20 저장
		arr[2] = 30; //배열의 세번째 요소에 값 30 저장
		//arr[3] = 40; //에러남. 배열의 길이를 벗어나는 index를 사용함
		int value = arr[1]; //배열의 두번째 요소값을 가져와서 value에 저장
		System.out.println(value);
	}
}
