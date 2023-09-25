package main;

/*
 * 강제형변환
 * */
public class Ex10 {

	public static void main(String[] args) {

		// 정수형의 강제 형변환
		int i = 1000;
		byte b = (byte) i; // 강제형변환이 발생할때는 자료형을 정확히 명시해주어야한다. byte형은 100을 표현할수 없으므로 값이 손실된다
		System.out.println(b); // -24

		// 실수형의 강제 형변환
		double d = 1.2;
		float f = (float) d; // 강제형변환이 발생할때는 자료형을 정확히 명시해주어야한다.

		// 정수형과 실수형의 강제형변환
		int i2 = (int) f; // int와 float형은 크기는 같지만, float형이 더 정밀한 자료형이다. 그래서 float->int는 강제형변환임
		System.out.println(i2); // 소수점아래를 잃었기 때문에 1.2에서 1이 됨 (강제형변환의 특징)
	}
}
