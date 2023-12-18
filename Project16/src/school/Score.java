package school;

/*
 * 점수 클래스
 * */
public class Score {
	int studentId; // 학번
	Subject subject; // 과목
	int point; // 점수

	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}

	// toString 메소드 재정의
	public String toString() {
		return "학번:" + studentId + "," + subject.subjectName + ":" + point;
	}
}
