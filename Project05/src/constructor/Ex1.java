package constructor;

/*
 * 디폴트 생성자를 사용하여 인스턴스 생성하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		Student student = new Student();
	}
}

class Student {
	int studentID;
	String studentName;

	// 클래스 내부에 생성자가 하나도 없으면 컴파일러가 디폴트 생성자를 만들어냄
//	public Student{
//		
//	}
}