package string;

/*
 * String클래스의 불변성 특징 확인하기
 * */
public class Ex2 {

	public static void main(String[] args) {

		String str = "test";
		System.out.println("str 문자열 값: " + str + ", 주소: " + str.hashCode());
		
		str = "aaa"; //문자열 객체는 값을 변경할수 없으므로 새로운 문자열이 생성됨
		System.out.println("str 문자열 값: " + str + ", 주소: " + str.hashCode()); //위와 주소가 다름
	}
}
