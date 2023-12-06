package object;

/*
 * 1. name과 type을 멤버변수로 가지는 Dog클래스를 만드세요.
 * 2. 다음과 같이 출력되도록 toString 메소드를 재정의하세요.
 * System.out.println(dog) -> "진돗개 멍멍이"
 * */
public class Quiz3 {

	public static void main(String[] args) {
		Dog dog = new Dog("초코", "진돗개");
		System.out.println(dog);
	}
}

class Dog{
	String name;
	String type;
	
	Dog(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	public String toString() {
		return type + " " + name;
	}
}

