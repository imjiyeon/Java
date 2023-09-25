package array.quiz;

/*
 * 5개 크기의 char 타입의 배열을 생성한다.
 * 값목록 초기화한다 {'a', 'b', 'c', 'd', 'e'}
 * 포문을 사용하여 모든 배열요소를 출력한다.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		char[] charArray = new char[] { 'a','b','c','d','e' };

		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i] + " ");
		}

	}

}
