package lambda;

/*
 * 람다식 활용하기 (1)
 * */

//함수형 인터페이스 선언
interface StringConcat {
	
	// 두 문자열을 연결하는 메소드 선언
	public void makeString(String s1, String s2); 
}

//구현 클래스 만들기
class StringConcatImpl implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1 + "," + s2);
	}

}

public class Ex3 {

	public static void main(String[] args) {

		// 구현 클래스 사용하기
		StringConcat concat1 = new StringConcatImpl();
		concat1.makeString("Hello", "World");

		// 람다식 함수 사용하기
		StringConcat concat2 = (str1, str2) -> System.out.println(str1 + "," + str2);
		concat2.makeString("Hello", "World");
	}

}
