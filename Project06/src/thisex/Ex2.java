package thisex;

/*
 * this 출력하기
 * */
public class Ex2 {

	public static void main(String[] args) {	
		
		Person person = new Person();
		person.setName("둘리");
		System.out.println(person); //참조 변수 출력
		person.printThis(); //동일한 주소가 출력됨
	}
}

class Person{
	String name;
	
	public void setName(String name) { //이름을 지정하는 메소드
		this.name = name; //같은 이름의 변수를 사용할 때, this를 사용해서 멤버변수와 지역변수를 구분함.
	}
	
	public void printThis() {
		System.out.println(this);  
	}
}