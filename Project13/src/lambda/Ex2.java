package lambda;

/*
 * 람다의 동작원리
 * */

@FunctionalInterface
interface MyNumber2 {
	int add(int num1, int num2);
}

public class Ex2 {
	public static void main(String[] args) {

		//MyNumber number = (x, y) -> x+y; // 람다식 함수 대입
		
		//람다식 함수를 대입하면, 실제로는 익명 클래스를 만들고 함수를 선언한다
		//그리고 객체를 생성하여 사용하는 것이다
		MyNumber number2 = new MyNumber() {
			@Override
			public int add(int x, int y) {
				return x+y;
			}
		};
		
		System.out.println(number2.add(10,20));
	}
}
