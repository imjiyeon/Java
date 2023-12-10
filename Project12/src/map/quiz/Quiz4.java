package map.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Quiz4 {

	public static void main(String[] args) {

		// 학생목록을 저장할 map 생성
		HashMap<Integer, Student> map = new HashMap<>();

		// 학생 추가
		map.put(1001, new Student(1001, "둘리", 90, 80, 70));
		map.put(1002, new Student(1002, "도우너", 55, 65, 75));
		map.put(1003, new Student(1003, "또치", 80, 50, 50));

		// 학생별 총점과 평균 구하기
		Set<Integer> keys = map.keySet();
		for(int key : keys) {
			Student student = map.get(key);
			int sum = student.kor + student.math + student.eng;
			double avg = sum / 3.0;
			System.out.println(student.studentName + "학생의 총점: " + sum + ", 평균: " + avg );
		}
		
		System.out.println();
		
		int korSum = 0;
		int mathSum = 0;
		int engSum = 0;
		
		// 과목별 총점과 평균 구하기
		for(int key : keys) {
			Student student = map.get(key);
			korSum = korSum + student.kor;
			mathSum = mathSum + student.math;
			engSum = engSum + student.eng;
		}
		
		System.out.println("국어의 총점: " + korSum + ", 평균: " + (korSum/3.0));
		System.out.println("수학의 총점: " + mathSum + ", 평균: " + (mathSum/3.0));
		System.out.println("영어의 총점: " + engSum + ", 평균: " + (engSum/3.0));

	}
}

//학생 클래스
class Student {
	int studentId; // 학번
	String studentName; // 이름
	int kor;
	int math;
	int eng;

	public Student(int studentId, String studentName, int kor, int math, int eng) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", kor=" + kor + ", math=" + math
				+ ", eng=" + eng + "]";
	}

}