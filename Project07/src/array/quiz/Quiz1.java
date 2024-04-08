package array.quiz;


//  5개 크기의 문자형 배열을 생성하세요.
//  값의 목록을 다음과 같이 초기화하세요. {'a', 'b', 'c', 'd', 'e'}
//  배열의 모든 요소를 출력하세요.

public class Quiz1 {

	public static void main(String[] args) {
		char[] charArray = { 'a','b','c','d','e' };

		System.out.println(charArray[0]);
		System.out.println(charArray[1]);
		System.out.println(charArray[2]);
		System.out.println(charArray[3]);
		System.out.println(charArray[4]);

		for(int i = 0; i < 5; i++){
			System.out.println(charArray[i]);
		}
	}

}
