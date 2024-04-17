package string.quiz;


//  "자바 프로그래밍 입문"이라는 문자열을 만드세요.
//  공백을 제외한 글자수만 세어서 출력하세요.
//
//  ex) "자바 프로그래밍 입문" -> 9 (전체:11 공백:2)

public class Quiz3 {

    public static void main(String[] args) {
    	
    	String str = "자바 프로그래밍 입문";
    	
    	int realLength = 0;
        for (int i = 0; i < str.length(); i++) {
            
            //공백도 문자로 취급함
            
            if (str.charAt(i) != ' ') {  // 공백이 아니면 숫자 증가
            	realLength++;
            }
        }

    	System.out.println(str.length()); // 공백을 포함한 길이는 11
        System.out.println(realLength);  // 공백을 제거한 길이는 9
    }
}
