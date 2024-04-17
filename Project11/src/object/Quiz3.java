package object;


//  다음과 같이 강아지 클래스(Dog)를 만드세요.
//  멤버변수: 이름(name) 품종(type)
//
//  이름은 멍멍이, 품종은 진돗개인 강아지 객체를 생성하세요
//
//  다음과 같이 출력되도록 toString 메소드를 재정의하세요.
//  System.out.println(dog) -> "진돗개 멍멍이"

public class Quiz3 {

	public static void main(String[] args) {
		
		Dog dog = new Dog("멍멍이", "진돗개");
		
		// 재정의된 함수가 호출되어 강아지의 이름과 품종이 출력됨
		System.out.println(dog.toString());
		System.out.println(dog); //dog.toString()과 같음
	}
}

// 강아지 클래스
class Dog{
	String name; //이름
	String type; //품종
	
	Dog(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	// 강아지의 이름과 품종이 출력되도록 재정의	
	public String toString() {
		return type + " " + name;
	}
}

