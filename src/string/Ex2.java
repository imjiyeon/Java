package string;

/*
 * String클래스 내부 구조 확인하기
 * String 클래스는 한번 생성된 문자열은 변경할 수 없음
 * */
public class Ex2 {

	public static void main(String[] args) {

		String str = "test";
		System.out.println("str 문자열 값: " + str + ", 주소: " + str.hashCode());
		
		str = "aaa"; //String은 값을 변경할수 없으므로 새로운 문자열이 생성됨
		System.out.println("str 문자열 값: " + str + ", 주소: " + str.hashCode());
	}
}
