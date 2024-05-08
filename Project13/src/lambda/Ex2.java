package lambda;

import lambda.Calc;

/*
 * 람다식으로 인터페이스 구현하기(2)
 * */

// 함수형 인터페이스 선언
// 함수형 어노테이션을 나타내는 어노테이션. 추상메소드가 한개 이상 추가되는 것을 막음 
@FunctionalInterface 
interface Calc {
	int add(int num1, int num2);
	// int max(int num1, int num2); //에러남. 추상메소드가 여러개면 람다식을 대입할 때, 어떤 메소드의 코드인지 알 수 없음
}

public class Ex2 {

	public static void main(String[] args) {
		
		// 메소드를 람다식으로 구현하면
		Calc calc1 = (x, y) -> x + y; // 람다식을 인터페이스 변수에 대입
		
		// 람다식의 동작 원리
		// 컴파일러가 람다식을 익명클래스로 변환하고, 클래스의 인스터스를 생성함
		Calc calc2 = new Calc() {
			@Override
			public int add(int x, int y) {
				return x + y;
			}
		};
		
		System.out.println(calc2.add(3, 5));
		
	}
}
