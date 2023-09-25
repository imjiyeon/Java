package lambda;

/*
 * 람다 활용하기1
 * - 두 문자를 연결하는 함수 만들기
 * */

//함수형 인터페이스 선언하기
interface StringConcat {
	public void makeString(String s1, String s2);
}

public class Ex3 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		//람다식 함수 사용하기
		StringConcat concat1 = (str1, str2)-> System.out.println(str1 + "," + str2 );

		//익명 클래스 사용하기
		StringConcat concat2 = new StringConcat() {
			@Override
			public void makeString(String str1, String str2) {
				System.out.println( str1 + "," + str2 );
			}
		};
		
		concat1.makeString(s1, s2);
		concat2.makeString(s1, s2);
	}
}
