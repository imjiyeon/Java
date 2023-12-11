package lambda.quiz2;

/*
 * 다음 코드를 람다식으로 변경하세요.
 * */

interface MyNumber {

	// 배열의 합을 구하는 메소드 선언
	void hap(int arr[]);
}

class MyNumberImpl implements MyNumber {

	@Override
	public void hap(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("합계: " + sum);
	}

}

public class Quiz2 {

	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4 };
		
		// 구현클래스 사용
		MyNumber myNumber1 = new MyNumberImpl();
		myNumber1.hap(arr);
		
		// 람다식 함수 사용
		MyNumber myNumber2 = (intArr) -> {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
			System.out.println("합계: " + sum);
		};
		myNumber2.hap(arr);

	}

}
