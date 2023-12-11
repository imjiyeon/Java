package lambda.ex1;

/*
 * 람다식 사용하기
 * */

// 함수형 인터페이스 선언
@FunctionalInterface //함수형 어노테이션을 나타내는 어노테이션. 추상메소드가 한개 이상 추가되는 것을 막음 
interface Calc {
	int add(int num1, int num2); // 추상메소드 선언
	// int max(int num1, int num2); //에러남. 추상메소드가 여러개면 람다식을 대입할 때, 어떤 메소드의 코드인지 알 수 없음
}

public class Ex1 {

	public static void main(String[] args) {
		
		// 람다식으로 함수 구현
		Calc calc = (x, y) -> x + y; // 람다식을 인터페이스 변수에 대입
		
		// 인터페이스 변수로 메소드 호출
		System.out.println(calc.add(3, 5));
		
	}
}
