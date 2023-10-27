package reference;

/*
 * 학생의 시험점수를 저장하는 프로그램 만들기
 * */
public class Ex1 {

	public static void main(String[] args) {		
		Subject math = new Subject("수학", 85); //수학과목
		Subject korean = new Subject("국어", 100); //국어과목	
		Student student = new Student(1001, "둘리", math, korean); //학생 객체 생성
	}
}


//성적을 저장하는 클래스 만들기
class Subject {
	String subjectName; //과목
	int scorePoint; //점수
	
	// 모든정보를 입력받는 생성자 generate
	public Subject(String subjectName, int scorePoint) {
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}

}

/*
 * 학생 클래스 만들고 시험성적 저장하기
 * */
class Student {
		
	int studentID; //학번
	String studentName; //이름
	Subject math; //수학과목 - Subject형을 사용해서 선언
	Subject korean; //국어과목 - Subject형을 사용해서 선언

	public Student(int studentID, String studentName, Subject math, Subject korean) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}

}

