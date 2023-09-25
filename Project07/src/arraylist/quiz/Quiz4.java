package arraylist.quiz;

import java.util.ArrayList;

/*
 * 학번과 이름 속성을 가지는 Student클래스를 만드세요
 * Student타입의 리스트를 생성하고 학생 3명을 추가하세요
 * 일반for문을 사용하여 배열의 모든 요소를 출력하세요
 * */
public class Quiz4 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1001,"둘리"));
		list.add(new Student(1002,"또치"));
		list.add(new Student(1003,"도우너"));
		
		Student student1 = list.get(0);
		student1.showStudentInfo();
		Student student2 = list.get(1);
		student2.showStudentInfo();
		Student student3 = list.get(2);
		student3.showStudentInfo();
		
		System.out.println("=== 일반 for문 사용 ===");
		for(int i=0; i<list.size(); i++){
			Student student = list.get(i);
			student.showStudentInfo();
		}

	}
}

class Student {
	int studentID; //학번
	String studentName; //이름

	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public void showStudentInfo(){
		System.out.println(studentID + "," + studentName);
	}
}