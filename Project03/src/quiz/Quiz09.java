package quiz;


//  <삼항연산자>

public class Quiz09 {

	public static void main(String[] args) {
		
		// 5가 3보다 크면, 문자 '오'를 출력하고, 아니면 문자 '삼'을 출력하세요
		char ch;
		ch = (5 > 3) ? '오': '삼';
		System.out.println(ch);
		
		//다음 코드를 보고 풀이과정과 예상결과값을 주석으로 작성하세요
		int x = 10;
		int y = 20;		
		int result = (x>10) ? y+10: y-10; //
		System.out.println(result); //
		
	}
	

}
