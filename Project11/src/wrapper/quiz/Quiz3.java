package wrapper.quiz;

/*
 * <wrapper 클래스 메소드 사용하기>
 * 
 * 정수 10을 문자열 변수에 저장하세요.
 * 실수 1.123을 문자열 변수에 저장하세요.
 * 문자 c를 문자열 변수에 저장하세요.
 * boolean타입의 true 값을 문자열 변수에 저장하세요.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		
		// 숫자를 문자열로 변환하려면 "toString" 메소드를 사용해야함	
		String str1 = Integer.toString(10); // 10 -> "10"

		String str2 = Double.toString(1.123); // 1.123 -> "1.123"
		
		String str3 = Character.toString('c'); // 'c' -> "c"
		
		String str4 = Boolean.toString(true); // true -> "true"
		
	}
}
