package object;

/*
 * 1. 학생 클래스 만들기
 * */
public class Student {
	//학생의 속성을 멤버 변수로 선언한다
	int studentID; //학번 (1001)
	String studentName; //이름 (둘리)
	int grade; //학년 (3)
	String address; //주소 (인천 남동구 ~)
	
	//학생의 정보를 출력하는 기능을 구현한다
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); //이름, 주소 출력
	}

}
