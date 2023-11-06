package ex;

/*
 * Calc 타입 변수를 선언하고 Calculator형 인스턴스를 대입하세요.
 * 원래 클래스 타입으로 다운캐스팅하고 showInfo() 메소드를 호출하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {

		Calc calc = new Calculator();

		if (calc instanceof Calculator) { // 인스턴스의 타입이 Calculator형이면
			Calculator calculator = (Calculator) calc; // Calculator형으로 다운캐스팅
			calculator.showInfo();
		}
	}

}
