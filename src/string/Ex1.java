package string;

/*
 * String클래스 선언하고 주소값 비교하기
 * */
public class Ex1 {

	public static void main(String[] args) {

		String str1 = "test"; //새로운 문자열 생성
		String str2 = "test"; //이미 만들어진 문자열을 가리킴
		String str3 = new String("test"); //새로운 문자열 생성
		
		System.out.println(str1 == str2); //이미 만들어진 문자열을 사용했으므로 주소 값이 같음
		System.out.println(str1 == str3); //새로 문자열이 생성됬으므로 주소값이 다름
		System.out.println();

	}
}
