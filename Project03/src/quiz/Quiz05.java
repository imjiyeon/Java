package quiz;

//  <비교연산자>
//  1.본인의 나이가 40세 이하라면 true를 출력하세요
//  2.본인의 나이가 40세가 맞다면 true를 출력하세요
//  3.본인의 나이가 40세가 아니라면 true를 출력하세요

public class Quiz05 {

	public static void main(String[] args) {
		
		int myAge = 33;
		
		boolean result1 = (myAge <= 40);
		boolean result2 = (myAge == 40);
		boolean result3 = (myAge != 40);
			
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}
}
