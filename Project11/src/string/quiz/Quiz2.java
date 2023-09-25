package string.quiz;


/* 
 * "안녕하세요 저는 둘리입니다" 라는 문자열을 생성하세요
 * 그리고 문자열에서 "둘리" 부분만 추출하여 출력하세요
*/
public class Quiz2 {

	public static void main(String[] args) {
		String str = "안녕하세요 저는 둘리입니다";
		System.out.println(str.substring(9,11));
	}
}