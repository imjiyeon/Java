package instance.quiz;

/* 1. 다음과 같이 Person 클래스 만든다
 *    나이, 이름, 결혼여부, 자식수를 멤버변수로 가진다.
 *    
 *    그리고 다음 정보를 가지는 인스턴스를 생성한다.
 *    - 나이 40살
 *    - 이름 James
 *    - 결혼여부 o
 *    - 자식 셋
 * */
public class Quiz1 {

	public static void main(String[] args) {
		Person person = new Person();
		person.age = 40;
		person.name = "James";
		person.isMarried = true;
		person.numberOfChildren = 3;
		
		System.out.println("나이 :" + person.age);
		System.out.println("이름 :" + person.name);
		System.out.println("결혼 여부 :" + person.isMarried);
		System.out.println("자녀 수 :" + person.numberOfChildren);
	}
}

class Person {
	int age;
	String name;
	boolean isMarried;
	int numberOfChildren;
}
