package reference;

/*
 * 기본형변수와 참조형변수의 메모리 구조 비교하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		//기본형 변수
		int num1 = 1;
		int num2 = 1;
		boolean result1 = (num1==num2); //참. 기초자료형은 값을 비교한다
		System.out.println(result1);
		
		//참조형 변수
		Subject math1 = new Subject("수학", 85);
		Subject math2 = new Subject("수학", 85);
		boolean result2 = (math1==math2); //거짓. 멤버변수의 값이 일치해도 실제 인스턴스의 주소가 다르다.
		System.out.println(result2);
	}
}
