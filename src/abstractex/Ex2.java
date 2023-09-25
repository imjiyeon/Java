package abstractex;

/*
 * 추상클래스 구현하기, 상속받기
 * */
public class Ex2 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//부모로 형변환
		Animal animal1 = new Dog();
		animal1.sound();
		Animal animal2 = new Cat();
		animal2.sound();
	}
}

abstract class Animal {
	public String kind; //동물의 종
	
	//breath()메소드는 동물들이 공통으로 사용하므로 일반 메소드로 선언
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}

	//sound()메소드는 동물마다 고유의 소리를 내도록 추상메소드로 선언
	public abstract void sound();
}

class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}