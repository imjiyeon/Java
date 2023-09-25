package inheritance.quiz;

/*
 * 사람, 학생, 교수 클래스를 만들고 상속관계를 구현하세요
 * 사람 클래스는 말하기, 먹기 기능을 가지고 있다
 * 학생 클래스는 말하기, 먹기, 공부하기 기능을 가지고 있다
 * 교수 클래스는 말하기, 먹기, 일하기 기능을 가지고 있다
 * 그리고 학생과 교수 클래스는 사람 클래스를 상속받는다
 * 
 * 학생 인스턴스를 생성하고 말하기, 먹기, 공부하기 메소드를 호출하세요
 * 교수 인스턴스를 생성하고 말하기, 먹기, 일하기 메소드를 호출하세요
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

class Person {

	public void sound() {
		System.out.println("대화를 한다");
	}

	public void eat() {
		System.out.println("밥을 먹는다");
	}
}

class Student extends Person {

	public void study() {
		System.out.println("공부를 한다");
	}
}

class Professor extends Person {

	public void work() {
		System.out.println("일을 한다");
	}
}