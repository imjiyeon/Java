package string.quiz;

/*
 * 문자열을 입력받았을때 공백을 제외한 글자수만 세어서 출력하세요
 * "자바 프로그래밍 입문"가 입력되면 공백 문자 2개를 제외하고 9라는 숫자를 출력할 것
 * */
public class Quiz4 {
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
