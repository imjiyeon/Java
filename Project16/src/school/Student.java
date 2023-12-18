package school;

import java.util.ArrayList;

/*
 * 학생 클래스
 * */
public class Student {

	public int studentId; // 학번
	public String studentName; // 이름

	// 학생이 수강한 과목의 점수 리스트
	ArrayList<Score> scoreList = new ArrayList<Score>();

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}

}
