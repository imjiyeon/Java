package override;

/*
 * 동물클래스를 상속받아 고양이 클래스를 만든다
 * 동물클래스를 상속받아 개 클래스를 만든다
 * 다음과 같은 결과를 출력하도록 eat메소드와 sound메소드를 재정의하세요 
 * */
public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.eat();
		cat.sound();
		dog.eat();
		dog.sound();
	}
}

class Animal {
	
	public void sound() {
		System.out.println("짖는다");
	}
	
	public void eat() {
		System.out.println("먹이를 먹는다");
	}
	
}

//gerenate 사용
class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("고양이는 야옹하고 짖는다");
	}

	@Override
	public void eat() {
		System.out.println("고양이는 쥐를 먹는다");
	}

}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("개는 멍멍하고 짖는다");
	}

	@Override
	public void eat() {
		System.out.println("개는 고기를 먹는다");
	}
	
}

