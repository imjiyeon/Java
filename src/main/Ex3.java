package main;

/*
 * 산술연산자
 * */
public class Ex3 {

	public static void main(String[] args) {

		int result1 = 10 + 2; // 더하기
		int result2 = 10 - 2; // 빼기 
		int result3 = 10 * 2; // 곱하기
		int result4 = 10 / 2; // 나누기
		int result5 = 10 % 2; // 나머지
		
		System.out.println(result1); // 합이 12
		System.out.println(result2); // 결과가 8
		System.out.println(result3); // 결과가 20
		System.out.println(result4); // 몫이 5
		System.out.println(result5); // 나머지가 0 -> 이 결과의 의미는 무엇일까? -> 10은 짝수다. 
		
		//나머지 연산자는 숫자가 짝수인지 홀수인지 확인하는 문제에서 많이 사용한다
	}
}
