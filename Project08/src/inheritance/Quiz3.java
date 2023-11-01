package inheritance;

/*
 * 사람(Person)을 정의하는 클래스를 만드세요.
 * 기능: 말하기, 먹기
 * 사람 클래스를 상속받는 학생(Student) 클래스를 만드세요.
 * 기능: 공부하기
 * 사람 클래스를 상속받는 교수(Professor) 클래스를 만드세요.
 * 기능: 일하기
 * 
 * 학생 인스턴스를 생성하고, 인스턴스가 가지고 있는 모든 메소드를 호출하세요.
 * 교수 인스턴스를 생성하고, 인스턴스가 가지고 있는 모든 메소드를 호출하세요.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		Student student = new Student();
		student.sound();
		student.eat();
		student.study();
		
		Professor professor = new Professor();
		professor.sound();
		professor.eat();
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