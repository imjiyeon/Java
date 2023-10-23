package method;

public class Ex1 {
	// 매개변수가 없고 반환값이 없는 메소드
	public static void method1() {
		// 메소드 내용만 수행한 후 리턴값이 없이 호출한 메소드로 돌아감
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
		return; // 생략 가능
	}

	// 매개변수가 없고 반환값이 있는 메소드
	public static String method2() {
		return "매개변수가 없지만 반환값이 있는 메소드입니다."; // 반환값과 반환타입이 일치해야함
	}

	// 매개변수가 있고 반환값이 없는 메소드
	public static void method3(int num1, int num2) { // 함수 호출시 전달받는 값이 매개변수이며, 메소드 내에서 사용
		int sum = num1 + num2;
		System.out.println("sum : " + sum);
	}

	// 매개변수가 있고 반환값이 있는 메소드
	public static int method4(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		method1();
		String str = method2();
		method3(1, 2);
		int i = method4(1, 2);
	}
}
