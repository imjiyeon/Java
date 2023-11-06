package ex;

/*
 * 새로운 버전의 계산기 클래스 만들기
 * */
public class Ex3 {
	public static void main(String[] args) {

		Calc calc = new Calculator(); // 이전 버전의 계산기 클래스 생성
//		Calc calc = new NewCalculator(); // 새로운 버전의 클래스로 교체
		System.out.println(calc.add(10, 5)); // 다른 코드는 변경할 필요 없음
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 0));
		System.out.println(calc.divide(10, 20));

	}
}

//새로운 버전의 계산기 클래스
class NewCalculator implements Calc { // 인터페이스 상속받기

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	// 곱하는 수가 0 또는 음수라면 에러코드 반환
	@Override
	public int times(int num1, int num2) {
		if (num2 > 0) {
			return num1 * num2;
		} else {
			return Calc.ERROR;
		}
	}

	// 첫번째숫자가 두번째숫자보다 더 작을 경우 에러코드 반환
	@Override
	public int divide(int num1, int num2) {
		if (num1 > num2) {
			return num1 / num2;
		} else {
			return Calc.ERROR;
		}
	}

}
