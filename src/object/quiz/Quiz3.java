package object.quiz;

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

/*
 * 먼저 name과 type을 멤버변수로 가지는 Dog클래스를 만든다.
 * 그리고 다음 코드의 출력결과가 "진돗개 멍멍이"가 되도록 Dog클래스를 수정하세요.
 * 
 * */
public class Quiz3 {

	public static void main(String[] args) {
		Dog dog = new Dog("멍멍이", "진돗개");
		System.out.println(dog);
	}
}

