package ex;

/*
 * 새로운 버전의 계산기 클래스 구현하기
 * */

public class Ex3 {
	public static void main(String[] args) {

		Calc calc = new NewCalculator(); //실제 클래스만 교체한다
		System.out.println(calc.add(10, 5)); //클래스 사용법은 그대로이다
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));
		
	}
}

class NewCalculator implements Calc { //Calc 인터페이스 상속받기 

	/*
	 * Q. 메소드 직접 구현하기
	 * 연산을 하기 전에 입력받은 값을 검증한다
	 * times() 곱하기함수에서 곱하는 수가 0 또는 음수라면 에러코드를 반환한다.
	 * divide() 나누기함수에서 첫번째숫자가 두번째숫자보다 더 작을 경우 에러코드를 반환한다.
	 * */

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
		if(num2 > 0) {
			return num1 * num2;	
		}else {
			return Calc.ERROR;
		}
	}

	@Override
	public int divide(int num1, int num2) {
		if (num1 > num2) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
	}

}
