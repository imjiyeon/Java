package array.quiz;

/*
 * 학번과 이름을 속성으로 가지는 Student클래스를 만드세요
 * 그리고 3개 크기의 Student형 배열을 생성하세요
 * 배열에 3명의 학생정보를 저장하세요
 * 모든 학생정보를 출력하세요
 * */
public class Quiz8 {
	
	public static void main(String[] args) {
		
		Student[] students = new Student[3]; //학생 3명을 저장할 배열 생성
		students[0] = new Student(1001, "James"); //인스턴스를 생성하고 배열에 저장
		students[1] = new Student(1002, "Tomas");
		students[2] = new Student(1003, "Edward");
		
		for(int i =0; i<students.length; i++) { //for문을 사용해서 배열의 모든 요소 출력
			students[i].showInfo();
		}
	}
}

class Student {
	int studentID; //학번
	String name; //이름
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println( studentID + "," + name);
	}
}
