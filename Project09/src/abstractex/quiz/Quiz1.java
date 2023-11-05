package abstractex.quiz;

/*
 * 자동차,소나타,아반떼 클래스를 정의하세요.
 * 자동차클래스에서 상속받은 메소드를 재정의하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {

		Sonata sonata = new Sonata();
		sonata.start();
		sonata.drive();
		sonata.stop();
		sonata.turnOff();
		System.out.println();

		Avante avante = new Avante();
		avante.start();
		avante.drive();
		avante.stop();
		avante.turnOff();
	}
}

// 자동차 클래스
abstract class Car { // 추상클래스로 지정

	// 추상메소드 선언
	public abstract void start();

	public abstract void drive();

	public abstract void stop();

	public abstract void turnOff();

}

// 아반떼 클래스
class Avante extends Car { // 상속받기

	@Override
	public void start() { // 물려받은 추상메소드 구현
		System.out.println("Avante 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Avante 시동을 끕니다.");
	}

}

// 소나타 클래스
class Sonata extends Car { // 상속받기

	@Override
	public void start() { // 물려받은 추상메소드 구현
		System.out.println("Sonata 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata 시동을 끕니다.");
	}

}
