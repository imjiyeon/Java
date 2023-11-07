package abstractex.quiz;

/*
 * 동물,사람,호랑이 클래스를 정의하세요.
 * 동물클래스에서 상속받은 메소드를 재정의하세요.
 * 사람과 호랑이에 메소드를 추가하세요.
 * */
public class Quiz3 {

	public static void main(String[] args) {

		Human human = new Human(); // 변수의 자료형으로 Human만 사용할 수 있음
		human.sleep();
		human.move();
		human.readBook();
		System.out.println();

		Tiger tiger = new Tiger(); // 변수의 자료형으로 Tiger만 사용할 수 있음
		tiger.sleep();
		tiger.move();
		tiger.hunting();

	}

}

// 동물 클래스
abstract class Animal { // 추상클래스로 지정

	// 자식클래스에서 공통으로 사용하는 기능은 일반메소드로 선언
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다");
	}

	// 자식클래스마다 다르게 사용하는 기능은 추상메소드 선언
	public abstract void move();

}

//사람 클래스
class Human extends Animal { // 상속받기

	@Override
	public void move() { // 물려받은 추상메소드 구현
		System.out.println("사람이 두 발로 걷습니다. ");
	}

	// 책을 읽는 메소드 추가
	public void readBook() {
		System.out.println("사람이 책을 읽습니다");
	}

}

//호랑이 클래스
class Tiger extends Animal { // 상속받기

	@Override
	public void move() { // 물려받은 추상메소드 구현
		System.out.println("호랑이가 네 발로 뜁니다. ");

	}

	// 먹이를 사냥하는 메소드 추가
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다");
	}

}
