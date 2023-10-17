package quiz;

/*
 * 산술연산자
 * 
 * 수학점수 mathScore 90
 * 영어점수 engSccore 70
 * 국어점수 korScore 100
 * 점수의 총점과 평균를 구하세요
 * */
public class Quiz4 {

	public static void main(String[] args) {

		int mathScore = 90;
		int engSccore = 70;
		int korScore = 100;
		
		//총점
		int totalScore = mathScore + engSccore + korScore;
		System.out.println("총점: " + totalScore); //260
		//평균
		double avgScore1 = totalScore / 3.0;
		System.out.println("평균: " + avgScore1); //86.66666666666667

	}
}
          