package instance.quiz;

//  다음과 같이 void 사람클래스(Person)를 정의하세요.
//  속성: 이름, 나이, 결혼여부, 자식수
//
//  그리고 Person 클래스를 사용하여 다음 정보를 가지는 인스턴스를 생성하세요.
//  이름: James
//  나이: 40세
//  결혼여부: o
//  자식: 3
public class Quiz1 {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "James";
		person.age = 40;
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("이름 :" + person.name);
		System.out.println("나이 :" + person.age);
		System.out.println("결혼 여부 :" + person.isMarried);
		System.out.println("자녀 수 :" + person.numberOfChildren);
	}
}

class Person {
	String name; //이름
	int age; //나이
	boolean isMarried; //결혼여부
	int numberOfChildren; //자식수
}
