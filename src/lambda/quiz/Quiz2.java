package lambda.quiz;

/*
 * 익명클래스로 MyNumber 인터페이스를 구현하였다.
 * 똑같이 동작하도록 람다식으로 인터페이스를 구현하세요.
 * */

/*
 * 람다식과 함수형인터페이스를 사용하여 배열의 합을 반환하는 함수를 만드세요.
 * int arr[] = {1,2,3,4};
 * ex. hap(arr) ----> 10
 * */

interface Calculator {
	 int hap(int arr[]);
}

public class Quiz2 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		
		Calculator calculator = (intArr) -> { 
				int sum = 0;
				for(int i=0; i<arr.length;i++) {
					sum = sum + arr[i];
				}
				return sum;
			};
		
		System.out.println(calculator.hap(arr));
			
	}

}
