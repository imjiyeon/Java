package quiz;

/*
 * <산술연산자와 비교연산자>
 * 1. 7이 홀수가 맞는지 확인하고, 결과를 출력하세요 
 * 2. 10이 짝수가 맞는지 확인하고, 결과를 출력하세요
 */
public class Quiz06 {

	public static void main(String[] args) {

		int value1 = 7 % 2; //나머지 구하기
		boolean result1 = (value1 == 1); //나머지가 1인지 확인
		System.out.println(result1);
		
		int value2 = 10 % 2;
		boolean result2 = (value2 == 0);
		System.out.println(result2);
	}

}
