package quiz;

/* 
 * <형변환>
 * 변수 두개를 선언해서 10과 2.0을 대입하고 두 변수의 사칙연산 결과를 정수로 출력하세요.
 * */
public class Quiz8 {
	public static void main(String[] args) {
		int i = 10;
		float f = 2.0f;

		System.out.println((int) (i + f));
		System.out.println((int) (i - f));
		System.out.println((int) (i * f));
		System.out.println((int) (i / f));

	}
}
