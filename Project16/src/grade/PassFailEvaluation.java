package grade;

/*
 * 교양 과목의 학점을 계산하는 클래스
 * */
public class PassFailEvaluation implements GradeEvaluation { // 상속받기

	// 점수에 따라 학점을 Pass와 Fail 로 부여하기
	
	@Override
	public String getGrade(int point) {
		if (point >= 70)
			return "P";
		else
			return "F";
	}
}
