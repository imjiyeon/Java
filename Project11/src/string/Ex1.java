package string;

/*
 * String클래스 선언하고 주소값 비교하기
 * */
public class Ex1 {

	public static void main(String[] args) {

		// 리터럴 방식으로 문자열 객체 생성
		String str1 = "test"; //새로운 문자열 생성
		String str2 = "test"; //상수풀에 이미 test 문자열이 있어서, 같은 객체를 사용함
		
		//new 방식으로 문자열 객체 생성 
		String str3 = new String("test"); //새로운 문자열 생성
		
		System.out.println(str1 == str2); //str1과 str2가 같은 객체를 공유해서 주소 값이 같음
		System.out.println(str1 == str3); //새로 문자열이 생성됬으므로 주소값이 다름

	}
}
