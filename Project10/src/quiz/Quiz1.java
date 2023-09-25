package quiz;

import ex.Calc;

/* <형변환과 다운캐스팅 복습하기>
 * 
 * 먼저 1번 예제의 계산기 클래스를 복사하세요
 * Calc 타입 변수를 선언하고 Calculator형 인스턴스를 대입하세요
 * calc 변수로 사칙연산 메소드를 호출하세요
 * 그리고 calc변수를 원래 인스턴스 타입으로 다운캐스팅하고 showInfo() 메소드를 호출하세요
 * */
public class Quiz1 {

	public static void main(String[] args){
		
		Calc calc = new Calculator(); // 부모타입으로 형변환
		
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 5));
		System.out.println(calc.divide(10, 5));
		
		if(calc instanceof Calculator) { // 원래 인스턴스 타입이 계산기 클래스 라면
			Calculator calculator2 = (Calculator)calc; //Calculator형으로 다운캐스팅
			calculator2.showInfo();
		}	
	}

}

class Calculator implements Calc {

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
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}

}
