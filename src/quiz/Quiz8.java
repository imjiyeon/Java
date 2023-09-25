package quiz;

/*
 * 삼항연산자
 * 1. 숫자 5가 숫자3보다 크면, 문자 '오' 아니면 문자 '삼' 출력하세요
 * 2. 코드를 보고 예상 결과와 풀이과정을 주석으로 작성하세요
 * */
public class Quiz8 {

	public static void main(String[] args) {
		//정답
		char ch;
		ch = (5 > 3) ? '오': '삼';
		System.out.println(ch);
		
		//정답
		int x = 10;
		int y = 20;		
		int result = (x>10) ? y+10: y-10; //
		System.out.println(result); //
		
	}
	

}
