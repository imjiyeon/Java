package downcasting;

import java.util.ArrayList;

/*
 * 사람, 학생, 회사원 클래스를 정의하세요.
 * Person형 리스트를 생성하고 학생과 회사원을 저장하세요.
 * 리스트에 저장된 사람을 모두 꺼내서, 메소드를 호출하세요.
 * */
public class Quiz2 {
	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Student("둘리")); //학생 추가
		list.add(new Employee("또치")); //회사원 추가

		for (Person person : list) {
			
			person.eat(); //부모가 물려준 eat메소드 호출
			
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