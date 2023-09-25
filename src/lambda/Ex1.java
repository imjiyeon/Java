package lambda;

/*
 * 함수형 프로그래밍 코드 작성하기
 * */

//추상메소드를 여러 개이면 람다식을 대입할 때, 어떤 메소드의 구현코드인지 알 수 없음
//어노테이션으로 함수형 인터페이스를 명시하면, 메소드를 하나 이상 선언하는 것을 막음
@FunctionalInterface 
interface MyNumber { //함수형 인터페이스 만들기
	int add(int num1, int num2);
	//int max(int num1, int num2); //에러남
}

public class Ex1 {
	
	public static void main(String[] args) {
		//람다식 함수를 쓰면 객체를 생성하지않고 사용할 수 있다
		
		MyNumber number = (x, y) -> x+y; // 람다식 함수 대입. 추상메소드의 구현코드가 됨
		System.out.println(number.add(10, 20));// 인터페이스 변수로 함수 호출하기	
	}
}
