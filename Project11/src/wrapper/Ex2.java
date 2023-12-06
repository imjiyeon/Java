package wrapper;

/*
 * Integer 클래스의 메소드 사용하기
 * */
public class Ex2 {
	
	public static void main(String[] args) {
				
		// 문자열을 사용하여 Integer 객체 생성
		Integer iNum1 = Integer.valueOf("100");
		
		// 정수를 사용하여 Integer 객체 생성
		Integer iNum2 = Integer.valueOf(100);
		
		// 문자열을 숫자타입으로 변환
		int num = Integer.parseInt("100");
		System.out.println("정수로 변환된 값: " + num);
		
		// 숫자를 문자열타입으로 변환
		String str = iNum1.toString();
		System.out.println("문자열로 변환된 값: " + str);

	}
	
}
