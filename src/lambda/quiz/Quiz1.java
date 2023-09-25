package lambda.quiz;

/*
 * 람다식과 함수형인터페이스를 사용하여 두 숫자 중 더 큰 값을 반환하는 함수를 만드세요.
 * ex. max(10, 20) ----> 20
 * */
interface MyNumber {
	 int max(int x, int y);
}

public class Quiz1 {

	public static void main(String[] args) {
		//익명클래스로 인터페이스 구현하기
		MyNumber number1 = new MyNumber() {
			@Override
			public int max(int x, int y) {
				return x>y? x:y;
			}
		};
		System.out.println(number1.max(10, 20));
		
		//람다식으로 인터페이스 구현하기
		MyNumber number2 = (x,y) -> x>y? x:y;
		System.out.println(number2.max(10, 20));
	}

}
