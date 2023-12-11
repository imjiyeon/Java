package lambda.ex2;

/*
 * 람다식의 동작 원리
 * */

// 함수형 인터페이스 선언
@FunctionalInterface
interface Calc {
	int add(int num1, int num2);
}

public class Ex2 {
	public static void main(String[] args) {
		
		// 메소드를 람다식으로 구현
		//Calc calc = (x, y) -> x + y;

		// 컴파일러는 람다식을 익명클래스로 변환하고, 클래스의 인스터스를 생성한다
		Calc calc = new Calc() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};

		// 함수 사용
		System.out.println(calc.add(3, 5));
		
	}
}
