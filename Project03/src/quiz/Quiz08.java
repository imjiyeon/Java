package quiz;

/*
 * <비교연산자와 논리연산자>
 * 1. int형변수 x를 선언하고 80을 대입하세요
 *    논리연산자를 사용하여 x가 50<x<100 범위에 포함되는지 확인하고, 결과를 출력하세요
 * 2. int형변수 y를 선언하고 5을 대입하세요
 *	  논리연산자를 사용하여 y가 10보다 작거나 30보다 큰지 확인하고, 결과를 출력하세요
 * */
public class Quiz08 {

	public static void main(String[] args) {

		int x = 80;
		boolean result1 = (x>50) && (x<100);
		System.out.println(result1);
		
		int y = 5;
		boolean result2 = (y<10) || (y>30);
		System.out.println(result2);
	}

}
