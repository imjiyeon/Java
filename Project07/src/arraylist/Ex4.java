package arraylist;

import java.util.ArrayList;

/*
 * 학생의 성적 관리하기
 * 둘리 학생은 국어와 수학을 수강 중
 * 도우너 학생은 국어, 영어, 과학, 사회를 수강 중
 * */
public class Ex4 {

	public static void main(String[] args) {
		Student student1 = new Student("둘리");
		student1.subjectList.add(new Subject("국어", 100)); // 둘리가 수강 중인 과목 추가
		student1.subjectList.add(new Subject("수학", 50));
		student1.showInfo(); // 학생 정보 출력

		Student student2 = new Student("도우너");
		student2.subjectList.add(new Subject("국어", 70)); // 도우너가 수강 중인 과목 추가
		student2.subjectList.add(new Subject("영어", 85));
		student2.subjectList.add(new Subject("과학", 70));
		student2.subjectList.add(new Subject("사회", 85));
		student2.showInfo(); // 학생 정보 출력
	}
}

class Subject {
	String name; // 과목명
	int score; // 점수

	public Subject(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
}

class Student {
	String studentName;
	ArrayList<Subject> subjectList; // 수강과목 목록을 저장할 리스트 선언

	public Student(String studentName) {
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>(); // 리스트 생성
	}

	// 학생의 총 점수를 출력하는 메소드
	public void showInfo() {
		int total = 0; // 총 점수
		for (Subject s : subjectList) {
			total = total + s.score;
		}
		System.out.println(studentName + " 학생의 총점은 " + total + " 입니다.");
	}
}
