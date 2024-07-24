package lambda;

/*
 * 다음 코드를 익명클래스, 람다식으로 변경하세요.
 * */

public class Quiz3 {

	public static void main(String[] args) {
		
		// 구현 클래스 사용하여 convert() 호출
		StringConverter converter1 = new ToUpperCaseConverter();
		String result1 = converter1.convert("Hello, World!");
		System.out.println("ToUpper 결과: " + result1);

		// Q. 익명클래스를 사용하여 convert("Hello, World!")를 호출하세요
		StringConverter converter2 = new StringConverter() {
			@Override
			public String convert(String s) {
				return s.toUpperCase();
			}
		};
		String result2 = converter2.convert("Hello, World!");
		System.out.println("ToUpper 결과: " + result2);

		// Q. 람다식을 사용하여 convert("Hello, World!")를 호출하세요
		StringConverter converter3 = s -> s.toUpperCase();
		String result3 = converter3.convert("Hello, World!");
		System.out.println("ToUpper 결과: " + result3);
	}

}

//함수형 인터페이스 선언
interface StringConverter {
	// 추상 메서드 선언
	String convert(String s); // 문자열을 대문자로 변환하는 함수
}

//Q.Hello의 구현 클래스 만들기
class ToUpperCaseConverter implements StringConverter {
	@Override
	public String convert(String s) {
		return s.toUpperCase();
	}
}
