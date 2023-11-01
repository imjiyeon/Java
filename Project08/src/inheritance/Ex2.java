package inheritance;

/*
 * 클래스 상속받기 (기능)
 * */
public class Ex2 {

	public static void main(String[] args) {
		Student student = new Student();
		student.sound(); // 부모클래스에서 물려받은 기능
		student.eat(); // 부모클래스에서 물려받은 기능
		student.study();

		Professor professor = new Professor();
		professor.sound();// 부모클래스에서 물려받은 기능
		professor.eat(); // 부모클래스에서 물려받은 기능
		professor.work();
	}

}

//사람 클래스
class Person {
	public void sound() {
		System.out.println("대화를 한다");
	}

	public void eat() {
		System.out.println("밥을 먹는다");
	}
}

// 학생 클래스
class Student extends Person {
	public void study() {
		System.out.println("공부를 한다");
	}
}

// 교수 클래스
class Professor extends Person {
	public void work() {
		System.out.println("일을 한다");
	}
}