package quiz;

/*
 * 비교연산자
 * 1. 본인의 나이가 40세 이하라면 true 출력
 * 2. 본인의 나이가 40세라면 true 출력
 * 3. 본인의 나이가 40세가 아니라면 true 출력
 * */
public class Quiz4 {

	public static void main(String[] args) {
		int myAge = 25;
		
		boolean result1 = (myAge <= 40);
		boolean result2 = (myAge == 40);
		boolean result3 = (myAge != 40);
			
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
