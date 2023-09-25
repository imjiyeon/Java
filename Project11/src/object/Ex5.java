package object;

/*
 * String클래스의 재정의된 toString, equals 메소드 사용하기
 * */
public class Ex5 {

	public static void main(String[] args) {
		
		String str1 = new String("test"); 
		System.out.println(str1.toString()); //문자열 값 출력
		System.out.println(str1); //참조변수를 출력시 자동으로 toString()메소드를 호출함
		
		String str2 = new String("test");
		
		if(str1.equals(str2)) { //내용 비교
			System.out.println("str1와 str2은 같은 문자열입니다");
		}
	}
}
