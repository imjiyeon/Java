package wrapper;

/*
 * Wrapper 클래스 사용하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		
		// Integer 클래스
		Integer iNum1 = new Integer(100); //Integer 클래스의 인스턴스 생성	
		
		// 자바5부터 객체를 생성할때 생성자를 사용하지 않고, 자동으로 박싱됨
		Integer iNum2 = 100; //new Integer(100)로 변환. (오토박싱)
		
		int num1 = iNum1.intValue(); //int값 꺼내기
		int num2 = iNum1; // iNum1.intValue()로 변환. (언박싱)	
		
		// 참조형과 기본형간의 연산 가능.
		int num3 = iNum1 + 100; // iNum1.intValue() + num2. 값이 변환되고 덧셈이 수행됨

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		
		// Boolean 클래스
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = false; // 오토박싱으로 객체 생성

		boolean bool1 = boolean1.booleanValue(); //boolean값 꺼내기
		boolean bool2 = boolean2; //언박싱으로 값 꺼내기
		
		System.out.println("bool1: " + bool1);
		System.out.println("bool2: " + bool2);
		
		// Character 클래스
		Character character1 = new Character('A');
		Character character2 = 'B'; // 오토박싱으로 객체 생성

		char char1 = character1.charValue(); //char값 꺼내기
		char char2 = character2; //언박싱으로 값 꺼내기
		
		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
		
	}
}
