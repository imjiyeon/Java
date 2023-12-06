package wrapper;

/*
 * Integer 클래스 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		
		Integer iNum1 = new Integer(100); //Integer 클래스의 인스턴스 생성	
		
		//자바9부터 객체를 생성할때 생성자를 사용하지 않고, 자동으로 박싱됨
		Integer iNum2 = 100; //new Integer(100)와 같음 (오토박싱)
		
		int num1 = iNum1.intValue(); //int값 꺼내기
		int num2 = iNum1; // iNum1.intValue()와 같음 (언박싱)
		
		int num3 = iNum1 + num2; // Integer가 자동으로 int로 변경되고, 덧셈이 수행됨 

		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		
	}
}
