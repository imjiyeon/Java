package main;

/*
 * 산술연산자
 * 연산과정 확인하기
 * */
public class Ex4 {

	public static void main(String[] args) {

		// 수학점수와 영어점수의 총점 구하기	
		int mathScore = 93; //수학점수와 영어점수 변수를 선언하고 값 대입
		int engSccore = 70;
		
		int totalScore = mathScore + engSccore; //총점 구하기
		System.out.println(totalScore); // 163
		
		// 평균점수를 정확하게 구하는 방법은 무엇일까?
		
		// 1. int형 변수에 결과 저장, 정수 2로 나누기
		int avgScore1 = totalScore / 2; // int/int
		System.out.println(avgScore1); //81
		
		// 2. double형 변수에 결과 저장, 정수 2로 나누기
		double avgScore2 = totalScore / 2; // int/int
		System.out.println(avgScore2); //81.0
		
		// 3. double형 변수에 결과 저장, 실수 2.0으로 나누기    *정답
		double avgScore3 = totalScore / 2.0; //  int/double  double/double
		System.out.println(avgScore3); //81.5
	}
}
