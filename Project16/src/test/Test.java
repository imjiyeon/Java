package test;

import school.Score;
import school.Student;
import school.Subject;

import java.util.ArrayList;

import school.GradeReport;
import util.Define;

/*
 * 테스트 클래스
 * */
public class Test {

	public static void main(String[] args) {

		// 학생 리스트
		ArrayList<Student> studentList = new ArrayList<Student>();

		Student student1 = new Student(181213, "안성원");
		Student student2 = new Student(181518, "오태훈");
		Student student3 = new Student(171230, "이동호");
		Student student4 = new Student(171255, "조성욱");
		Student student5 = new Student(171590, "최태평");

		// 학교에 학생 추가
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);

		// 과목 리스트
		ArrayList<Subject> subjectList = new ArrayList<Subject>();

		Subject korean = new Subject("국어", Define.KOREAN, 1);
		Subject math = new Subject("수학", Define.MATH, 1);
		Subject dance = new Subject("댄스", Define.DANCE, 2);

		subjectList.add(korean);
		subjectList.add(math);
		subjectList.add(dance);

		// 국어 과목을 수강하는 학생 등록
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);

		// 수학 과목을 수강하는 학생 등록
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);

		// 댄스 과목을 수강하는 학생 등록
		dance.register(student1);
		dance.register(student2);
		dance.register(student3);

		// 각 학생의 과목 점수 추가
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		addScoreForStudent(student1, dance, 95);

		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 95);
		addScoreForStudent(student2, dance, 85);

		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student3, dance, 55);

		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);
		addScoreForStudent(student4, dance, 40);

		addScoreForStudent(student5, korean, 85);
		addScoreForStudent(student5, math, 56);
		addScoreForStudent(student5, dance, 80);

		// 과목별 성적 출력
		GradeReport gradeReport = new GradeReport();

		String report = gradeReport.getReport(subjectList);
		System.out.println(report);

	}

	// 학생의 점수를 추가하는 메소드
	public static void addScoreForStudent(Student student, Subject subject, int point) {

		Score score = new Score(student.studentId, subject, point); // 점수 생성

		student.scoreList.add(score); // 점수 추가

	}
}
