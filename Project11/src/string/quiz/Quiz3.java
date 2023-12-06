package string.quiz;

/*
 * 1. "자바 프로그래밍 입문"이라는 문자열을 만드세요.
 * 2. 공백을 제외한 글자수만 세어서 출력하세요.
 * 3. 함수로 만들어서 호출해주세요.
 * 
 * ex) "자바 프로그래밍 입문" -> 9 (전체11 공백2)
 * */
public class Quiz3 {
	static int getCharCount(String s) {
        int realLength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {  // 공백이 아닌 경우에만 결과값을 증가
            	realLength++;
            }
        }
        return realLength;
    }

    public static void main(String[] args) {
    	System.out.println("자바 프로그래밍 입문".length());  // 11 출력
        System.out.println(getCharCount("자바 프로그래밍 입문"));  // 9 출력
    }
}
