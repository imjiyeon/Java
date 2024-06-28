package loop.quiz;


//  정수형 변수 n을 선언하고 값을 대입하세요.
//  n의 크기만큼 *별을 출력하세요.
//  n=5 -> *****

public class Quiz3 {

	public static void main(String[] args) {
		int n = 5;

		// * 은 반복횟수만큼 출력됨. n을 조건문에 사용할 것
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}
}
