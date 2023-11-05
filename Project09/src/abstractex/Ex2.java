package abstractex;

/*
 * 추상클래스 만들고 상속받기
 * */
public class Ex2 {
	public static void main(String[] args) {

		Animal animal1 = new Dog(); // 부모로 형변환
		animal1.sound(); //재정의된 메소드가 호출됨
		
		Animal animal2 = new Cat();
		animal2.sound();
	}
}

//동물 클래스
abstract class Animal {
	String kind; // 동물의 종

	// 공통기능은 일반메소드로 선언
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}

	// 동물마다 고유의 소리를 내므로 추상메소드로 선언
	public abstract void sound();
}

//고양이 클래스
class Cat extends Animal { // 상속받기
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() { // 물려받은 추상메소드 구현하기
		System.out.println("야옹");
	}
}

// 강아지 클래스
class Dog extends Animal { // 상속받기
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() { // 물려받은 추상메소드 구현하기
		System.out.println("멍멍");
	}
}