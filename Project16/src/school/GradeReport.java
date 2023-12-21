package school;

import java.util.ArrayList;

import grade.GradeEvaluation;
import grade.MajorEvaluation;
import grade.PassFailEvaluation;
import util.Define;

/*
 * 리포트 클래스
 * */
public class GradeReport {

	// 리포트에 들어갈 헤더
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름 | 학번 | 점수 \n";
	public static final String LINE = "---------------------\n";
	private StringBuffer buffer;

	public GradeReport() {
		buffer = new StringBuffer();
	}

	// 과목별 리포트 만들기
	public String getReport(ArrayList<Subject> subjectList) {
		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}

		return buffer.toString(); // 문자열 반환
	}

	// 헤더 부분을 만드는 메소드
	public void makeHeader(Subject subject) {
		buffer.append(GradeReport.LINE);
		buffer.append("  " + subject.subjectName);
		buffer.append(GradeReport.TITLE);
		buffer.append(GradeReport.HEADER);
		buffer.append(GradeReport.LINE);
	}

	// 바디 부분을 만드는 메소드
	// 매개변수: 과목
	public void makeBody(Subject subject) {

		ArrayList<Student> studentList = subject.studentList;

		for (int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			buffer.append(student.studentName);
			buffer.append(" | ");
			buffer.append(student.studentId);
			buffer.append(" | ");

			getScoreGrade(student, subject); // 학생별 학점 계산
			buffer.append("\n");
			buffer.append(LINE);
		}
		
		System.out.println();
		
		// 모든 학생의 학점이 계산됨
		// 안성원 | 181213 | 95:A | 
		// ---------------------
		// 오태훈 | 181518 | 95:A |
		// ---------------------
		// 이동호 | 171230 | 100:A |
		// ---------------------
		// 조성욱 | 171255 | 89:B |
		// ---------------------
		// 최태평 | 171590 | 85:B |
		// ---------------------
	}

	// 과목별로 학점을 계산하는 메소드
	// 매개변수: 학생, 과목
	public void getScoreGrade(Student student, Subject subject) {

		// 학생의 점수 리스트 꺼내기
		ArrayList<Score> scoreList = student.scoreList;

		// 학생이 가지고 있는 점수 중에서 특정과목의 점수 찾기
		for (int i = 0; i < scoreList.size(); i++) {

			Score score = scoreList.get(i);

			// 특정 과목의 점수를 찾았다면
			if (score.subject.subjectId == subject.subjectId) {
				String grade;

				// 필수과목/교양과목 여부에 따라 학점 계산
				if (subject.subjectType == Define.TYPE1) {
					GradeEvaluation gradeEvaluation = new MajorEvaluation();
					grade = gradeEvaluation.getGrade(score.point); // 학점

				} else {
					GradeEvaluation gradeEvaluation = new PassFailEvaluation();
					grade = gradeEvaluation.getGrade(score.point); // 학점
				}
				buffer.append(score.point);
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}

		// 한 학생의 학점이 계산됨 ("안성원 | 181213 | 95:A |)
	}

	public void makeFooter() {
		buffer.append("\n");
	}
}