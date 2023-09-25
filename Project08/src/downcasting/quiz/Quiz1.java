package downcasting.quiz;

import java.util.ArrayList;

public class Quiz1 {
	public static void main(String[] args) {
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Student("둘리")); //학생 추가
		list.add(new Employee("또치")); //회사원 추가

		for (Person person : list) {
			
			person.eat(); //Person이 물려준 eat메소드 호출
			if (person instanceof Student) { //인스턴스의 타입이 Student형이라면
				Student student = (Student) person; //Student형으로 다운캐스팅
				student.study();
			} else if (person instanceof Employee) {
				Employee employee = (Employee) person;
				employee.work();
			}
		}
	}
}

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + "가 밥을 먹는다");
	}
}

class Student extends Person {

	public Student(String name) {
		super(name);
	}

	public void study() {
		System.out.println(name + " 학생이 공부를 한다");
	}
}

class Employee extends Person {

	public Employee(String name) {
		super(name);
	}

	public void work() {
		System.out.println(name + " 회사원이 일을 한다");
	}
}