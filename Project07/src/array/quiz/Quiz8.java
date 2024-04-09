package array.quiz;


//  학생(Student)을 정의하는 클래스를 만드세요.
//  속성: 학번, 이름
//  학번과 이름을 초기화하는 생성자
//  학생의 정보를 출력하는 메소드
//
//  3개 크기의 Student형 배열을 생성하고, 3명의 학생정보를 저장하세요.
//  그리고 배열에 저장된 모든 학생의 정보를 출력하세요.

public class Quiz8 {

	public static void main(String[] args) {

		// 학생 3명을 저장할 배열 생성
		Student[] students = new Student[3];

		// 인스턴스를 생성하고 배열에 저장
		students[0] = new Student(1001, "James");
		students[1] = new Student(1002, "Tomas");
		students[2] = new Student(1003, "Edward");

		// for문을 사용해서 배열의 모든 요소 출력
		for (int i = 0; i < students.length; i++) {
			students[i].showInfo();
		}
	}
}

// 학생 클래스
class Student {
	int studentID; // 학번
	String name; // 이름

	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	public void showInfo() {
		System.out.println(studentID + "," + name);
	}
}
