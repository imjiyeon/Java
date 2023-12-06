package string.quiz;

/*
 * 1. 문자열 "a:b:c:d"을 만드세요.
 *    그리고 문자열을 "a#b#c#d"로 변경하세요.
 *    
 * 2. "안녕하세요 저는 둘리입니다" 라는 문자열을 만드세요.
 *    그리고 문자열에서 "둘리" 부분만 추출하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		//1.
		String a = "a:b:c:d";
		String b = a.replace(":", "#");
		System.out.println(b); // a#b#c#d 출력

		//2.
		String str = "안녕하세요 저는 둘리입니다";
		System.out.println(str.indexOf("둘")); // "둘리"의 인덱스를 찾기
		System.out.println(str.substring(9, 11)); // 시작위치, 마지막위치(포함x)
	}

}
