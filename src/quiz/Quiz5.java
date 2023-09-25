package quiz;

/*
 * 산술연산자, 비교연산자
 * 1. 7이 홀수라면 true 출력하세요 
 * 2. 10이 짝수라면 true 출력하세요
 */
public class Quiz5 {

	public static void main(String[] args) {

		//정답
		int value1 = 7 % 2; //나머지를 구한다
		boolean result1 = (value1 == 1); //나머지가 1인지확인한다
		System.out.println(result1);
		
		//정답
		int value2 = 10 % 2;
		boolean result2 = (value2 == 0);
		System.out.println(result2);
	}

}
