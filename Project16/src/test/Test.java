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

		// 학생 리스트 만들기
		ArrayList<Student> studentList = new ArrayList<Student>();

		Student student1 = new Student(181213, "안성원");
		Student student2 = new Student(181518, "오태훈");
		Student student3 = new Student(171230, "이동호");
		Student student4 = new Student(171255, "조성욱");
		Student student5 = new Student(171590, "최태평");

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);

		// 과목 리스트 만들기
		ArrayList<Subject> subjectList = new ArrayList<Subject>();

		Subject korean = new Subject("국어", Define.KOREAN, 1);
		Subject math = new Subject("수학", Define.MATH, 1);
		Subject dance = new Subject("댄스", Define.DANCE, 2);

		subjectList.add(korean);
		subjectList.add(math);
		subjectList.add(dance);

		// 과목별로 수강신청하기
		register(korean, student1);
		register(korean, student2);
		register(korean, student3);
		register(korean, student4);
		register(korean, student5);
		
		register(math, student1);
		register(math, student2);
		register(math, student3);
		register(math, student4);
		register(math, student5);

		register(dance, student1);
		register(dance, student2);
		register(dance, student3);
		
		// 학생의 성적 추가하기
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

		// 과목별로 학점 리포트 출력하기
		GradeReport gradeReport = new GradeReport();
		String report = gradeReport.getReport(subjectList);
		System.out.println(report);

	}

	// 학생의 점수를 추가하는 메소드
	public static void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.studentId, subject, point); // 점수 생성
		student.scoreList.add(score); // 점수 추가
	}
	
	// 수강 신청 메소드
	public static void register(Subject subject, Student student) {
		subject.studentList.add(student);
	} 
}
