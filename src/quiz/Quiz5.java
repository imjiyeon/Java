package quiz;

/*
 * <함수>
 * 
 * reverse 함수는 문자열을 거꾸로 출력합니다
 * 메인 함수에서는 문자열 변수를 선언하고, reverse 함수를 호출합니다
 * */
public class Quiz5 {

	public static void main(String[] args) {
		String str = "안녕하세요";
		reverse(str);
	}

	public static void reverse(String str) {

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i)+" ");
		}

	}
}
