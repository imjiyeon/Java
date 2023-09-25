package staticex;

/*
 * static 변수와 메소드 사용하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		System.out.println(10*10*Calculator.pi); //pi변수를 클래스이름으로 직접 사용함. 원의 둘레를 구함
		System.out.println(Calculator.plus(10,5)); //두수의 합을 구하기 위해 plus메소드를 클래스이름으로 직접 호출
		System.out.println(Calculator.minus(10,5)); //두수의 차를 구하기 위해 minus메소드를 클래스이름으로 직접 호출
	}
}

class Calculator {	
	static double pi = 3.14159; //원의 둘레를 구할 때 사용하는 파이값은 항상 같으므로, 공용데이터롤 선언
	
	static int plus(int x, int y) { //덧셈, 뺄셈 기능은 외부에서 들어온 값만 사용하고, 인스턴스 필드를 사용하지 않으므로 static메소드로 선언
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}
}