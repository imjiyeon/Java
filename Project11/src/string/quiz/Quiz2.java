package string.quiz;


/* 
 * 1. "안녕하세요 저는 둘리입니다" 라는 문자열을 만드세요.
 * 2. 문자열에서 "둘리" 부분만 추출하세요.
*/
public class Quiz2 {

	public static void main(String[] args) {
		
		String str = "안녕하세요 저는 둘리입니다"; 
		
		System.out.println(str.indexOf("둘")); //"둘리"의 인덱스를 찾기
		
		System.out.println(str.substring(9,11)); //시작위치, 마지막위치(포함x)
	}
}