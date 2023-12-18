package school;

import java.util.ArrayList;
import util.Define;

/*
 * 과목 클래스
 * */
public class Subject {
	private String subjectName; // 과목 이름
	private int subjectId; // 과목 고유 번호
	private int gradeType; // 학점 평가 정책

	// 이 과목을 수강하는 학생 리스트
	private ArrayList<Student> studentList = new ArrayList<Student>();

	public Subject(String subjectName, int subjectId, int gradeType) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = gradeType;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	// 수강 신청 메소드
	public void register(Student student) {
		studentList.add(student);
	}
}