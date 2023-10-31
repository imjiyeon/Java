package array.quiz;

/*
 * 5개 크기의 문자형 배열을 생성하세요.
 * 값의 목록을 다음과 같이 초기화하세요. {'a', 'b', 'c', 'd', 'e'}
 * 반복문을 사용하여 배열의 요소를 출력하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		char[] charArray = new char[] { 'a','b','c','d','e' };

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}

	}

}
