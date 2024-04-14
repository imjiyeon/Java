package abstractex;

/*
 * 추상클래스 만들고 상속받기
 * */
public class Ex2 {
	public static void main(String[] args) {

		Animal animal1 = new Dog(); // 부모로 형변환
		animal1.sound(); // 재정의된 메소드가 호출됨

		Animal animal2 = new Cat();
		animal2.sound();
	}
}

//동물 클래스
abstract class Animal { // 추상클래스로 지정

	// 공통기능은 일반메소드로 선언
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}

	// 동물마다 내는 소리가 다르니까 추상메소드로 선언 
	public abstract void sound();
}

//고양이 클래스
class Cat extends Animal { // 상속받기

	@Override
	public void sound() { // 물려받은 추상메소드 구현
		System.out.println("야옹");
	}
}

// 강아지 클래스
class Dog extends Animal { // 상속받기

	@Override
	public void sound() { // 물려받은 추상메소드 구현
		System.out.println("멍멍");
	}
}