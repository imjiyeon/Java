package school;

import java.util.ArrayList;

import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import util.Define;

/*
 * 리포트 클랫
 * */
public class GradeReport {

	// 리포트에 들어갈 헤더
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름 | 학번 | 점수 \n";
	public static final String LINE = "---------------------\n";
	private StringBuffer buffer = new StringBuffer();

	// 과목별 리포트 만들기
	public String getReport(ArrayList<Subject> subjectList) {
		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}

		return buffer.toString(); // 문자열 반환
	}

	public void makeHeader(Subject subject) {
		buffer.append(GradeReport.LINE);
		buffer.append("  " + subject.getSubjectName());
		buffer.append(GradeReport.TITLE);
		buffer.append(GradeReport.HEADER);
		buffer.append(GradeReport.LINE);
	}

	public void makeBody(Subject subject) {

		ArrayList<Student> studentList = subject.getStudentList();

		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.studentName);
			buffer.append(" | ");
			buffer.append(student.studentId);
			buffer.append(" | ");

			getScoreGrade(student, subject); // 학생별 수강 과목 학점 계산
			buffer.append("\n");
			buffer.append(LINE);
		}
	}

	public void getScoreGrade(Student student, Subject subject) {

		ArrayList<Score> scoreList = student.scoreList;

		for (int i = 0; i < scoreList.size(); i++) {

			Score score = scoreList.get(i);
			if (score.getSubject().getSubjectId() == subject.getSubjectId()) { // 학점 산출할 과목
				String grade;

				if (subject.getGradeType() == Define.TYPE1) { // 필수 과목인 경우
					GradeEvaluation gradeEvaluation = new MajorEvaluation();
					grade = gradeEvaluation.getGrade(score.getPoint());

				} else { // 교양 과목인 경우
					GradeEvaluation gradeEvaluation = new PassFailEvaluation();
					grade = gradeEvaluation.getGrade(score.getPoint());
				}
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}

	public void makeFooter() {
		buffer.append("\n");
	}
}