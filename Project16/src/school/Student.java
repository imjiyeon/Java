package school;

import java.util.ArrayList;

/*
 * 학생 클래스
 * */
public class Student {

	public int studentId; // 학번
	public String studentName; // 이름
	public ArrayList<Score> scoreList; // 학생의 점수 리스트

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		scoreList = new ArrayList<Score>(); // 리스트 생성
	}

}
