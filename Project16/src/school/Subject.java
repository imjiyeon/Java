package school;

import java.util.ArrayList;
import util.Define;

/*
 * 과목 클래스
 * */
public class Subject {
	
	String subjectName; // 과목 이름
	int subjectId; // 과목 고유 번호 (1001: 국어, 2001: 수학, 3001: 댄스)
	int subjectType; // 과목 구분 (1: 필수, 2: 교양)

	// 이 과목을 수강하는 학생 리스트
	public ArrayList<Student> studentList;

	public Subject(String subjectName, int subjectId, int subjectType) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.subjectType = subjectType;
		studentList = new ArrayList<Student>(); // 리스트 생성
	}

}