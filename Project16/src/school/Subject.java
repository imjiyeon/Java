package school;

import java.util.ArrayList;
import util.Define;

/*
 * 과목 클래스
 * */
public class Subject {
	
	String subjectName; // 과목 이름
	int subjectId; // 과목 고유 번호
	int gradeType; // 과목 종류 (1: 필수, 2: 교양)

	// 이 과목을 수강하는 학생 리스트
	public ArrayList<Student> studentList;

	public Subject(String subjectName, int subjectId, int gradeType) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = gradeType;
		studentList = new ArrayList<Student>(); // 리스트 생성
	}

}