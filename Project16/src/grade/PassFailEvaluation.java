package grade;

/*
 * 교양 과목 학점 정책
 * */
public class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		if (point >= 70)
			return "P";
		else
			return "F";
	}
}
