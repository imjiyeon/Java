package staticex;

/*
 * static 변수와 메소드를 사용하여 계산기 만들기
 * */
public class Ex3 {

	public static void main(String[] args) {
		System.out.println(10*10*Calculator.pi); //원의 둘레 구하기
		System.out.println(Calculator.plus(10,5)); //두 수의 합 구하기
		System.out.println(Calculator.minus(10,5)); //두 수의 차 구하기
	}
}

class Calculator {	
	static double pi = 3.14159; //원의 둘레를 구할 때 사용하는 파이값은 항상 같으므로, 공용속성으로 선언
	
	static int plus(int x, int y) { //덧셈, 뺄셈 기능은 외부에서 들어온 값만 사용하고, 인스턴스 멤버를 사용하지 않으므로 static메소드로 선언
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}

