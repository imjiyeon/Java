package school;

import java.util.ArrayList;
import util.Define;

/*
 * 과목 클래스
 * */
public class Subject {
	
	String subjectName; // 과목 이름
	int subjectId; // 과목 고유 번호
	int gradeType; // 학점 평가 정책

	// 이 과목을 수강하는 학생 리스트
	ArrayList<Student> studentList = new ArrayList<Student>();

	public Subject(String subjectName, int subjectId, int gradeType) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = gradeType;
	}
	
	// 수강 신청 메소드
	public void register(Student student) {
		studentList.add(student);
	}

}