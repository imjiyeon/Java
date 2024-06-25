package quiz;

//  <산술연산자>
//  수학, 영어, 국어의 점수가 각각 90, 70, 100일 때,
//  이 과목들의 총점과 평균을 구하세요

public class Quiz04 {

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
          