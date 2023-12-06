package string.quiz;

/*
 * 이전 문제를 함수형태로 바꾸고 호출하세요.
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
