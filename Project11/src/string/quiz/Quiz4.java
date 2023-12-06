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
    	
    	System.out.println("자바 프로그래밍 입문".length());  // 공백을 포함한 길이는 11
    	
        System.out.println(getCharCount("자바 프로그래밍 입문"));  // 공백을 제거한 길이는 9
        
        System.out.println(getCharCount("equals 메소드는 두 객체가 같은지 비교한다")); // 21
        
    }
}
