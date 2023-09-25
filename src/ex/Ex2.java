package ex;

public class Ex2 {
	
	public static void main(String[] args) {
		method1(new Calculator()); //인터페이스를 구현한 클래스를 대입
		Calc calc = method2();
		System.out.println(calc.add(1, 2));
	}
	
	//인터페이스 타입 매개변수
	static void method1(Calc c) {
		System.out.println("첫번째 메소드 입니다");
	}
	
	//인터페이스 타입 리턴타입
	static Calc method2() {
		return new Calculator();  //인터페이스를 구현한 클래스를 반환
	}
	
}
