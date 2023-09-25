package string.quiz;

/*
 * 먼저 문자열 "a:b:c:d"을 만들고
 * 이 문자열을 "a#b#c#d"로 바꿔서 출력해주세요.
 * */

public class Quiz1 {

	public static void main(String[] args) {
		String a = "a:b:c:d";
		String b = a.replace(":", "#");
		System.out.println(b); // a#b#c#d 출력
	}

}
