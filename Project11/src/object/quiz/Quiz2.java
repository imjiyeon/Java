package object.quiz;

/*
 * Student클래스를 복사
 * Object형 변수를 선언하고 Student형으로 인스턴스를 대입하세요
 * 그리고 다시 원래자료형으로 다운캐스팅하세요
 * */

public class Quiz2 {

	public static void main(String[] args) {

		Object obj = new Student(1001, "둘리"); //Object는 모든 클래스의 부모이기때문에 형변환이 가능하다
		
		if (obj instanceof Student) {
			Student student = (Student)obj;
			System.out.println("obj은 Student인스턴스입니다.");
		}		
		
	}
}

//카피
class Student {
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.id == student.id) {
				return true;
			}
		}
		return false;
	}	
}

