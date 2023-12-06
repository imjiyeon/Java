package string.quiz;

/*
 * 1. 문자열 "a:b:c:d"을 만드세요.
 * 2. 문자열을 "a#b#c#d"로 변경하세요.
 * */

public class Quiz1 {

	public static void main(String[] args) {
		String a = "a:b:c:d";
		String b = a.replace(":", "#");
		System.out.println(b); // a#b#c#d 출력
	}

}
