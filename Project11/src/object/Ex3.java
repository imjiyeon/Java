package object;



/*
 * object클래스의 equals메소드 사용하기
 * */
public class Ex3 {

	public static void main(String[] args) {

		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "둘리");
		
		//비교연산자로 비교
		if (student1 == student2) { //메모리 주소로 비교. (100번지 == 200번지)
			System.out.println("student1와 student2의 주소는 같습니다.");
		} else {
			System.out.println("student1와 student2의 주소는 다릅니다.");
		}
		
		//equals 메소드로 비교
		if (student1.equals(student2)) { //학생의 학번으로 비교. (1001 == 1001)
			System.out.println("student1와 student2는 같은 학생입니다.");
		} else {
			System.out.println("student1와 student2는 다른 학생입니다.");
		}
		
		//Q. 재정의함수를 주석처리해서 원형메소드로 비교하기 

	}
}


class Student {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) { //함수인자가 Object타입이므로 Student클래스로 형변환 해야한다
		if(obj instanceof Student) { //obj를 형변환하기전에 실제객체가 Student형인지 확인한다  
			Student student = (Student)obj; //Object에서 Student로 형변환
			if(this.id == student.id) { //학번이 같으면 같은 학생으로 판단한다
				return true;
			}
		}
		return false;

//		return super.equals(obj); // 메모리주소를 비교
	}	

}
