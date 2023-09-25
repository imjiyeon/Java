package ex;

/*
 * 계산기 인터페이스 구현하기
 * */
public class Ex1 {
	public static void main(String[] args) {

		// Calc calc = new Calc(); //인터페이스는 추상메소드로 이루어져 있기 때문에 인스턴스를 생성할 수 없음
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10, 5));
		System.out.println(calculator.substract(10, 5));
		System.out.println(calculator.times(10, 5));
		System.out.println(calculator.divide(10, 5));

	}
}

// 계산기 클래스

class Calculator implements Calc { //Calc 인터페이스 상속받기

	// Q. Calc 인터페이스 상속받고 더하기,빼기,곱하기,나누기 메소드 직접 구현하기
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	//Calculator에서 추가한 메소드
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}

}

