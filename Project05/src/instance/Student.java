package instance;

/*
 * 학생 클래스
 * */
public class Student {	
	int studentID; //학번
	String studentName; //이름
	int grade; //학년
	String address; //주소

	//학생의 이름을 가져오는 함수 선언
	public String getStudentName() {
		return studentName;
	}	
	//학생의 이름을 변경하는 함수 선언
	public void setStudentName(String name){
		studentName = name;
	}
	//학생의 모든 정보를 보여주는 함수 선언
	public void showStudentInfo() {
		System.out.println("학번:" + studentID + ", 이름:" + studentName + ", 학년: " + grade + ", 주소:" + address);
	}

}

