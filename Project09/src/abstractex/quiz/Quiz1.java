package abstractex.quiz;

/*
 * 추상클래스 Car 내용을 보고,
 * 테스트 클래스 내용을보고
 * 아래와 같이 출력결과가 나오도록
 * Car를 상속받아서 Sonata, Avante 클래스를 만드시오
 * */
public class Quiz1 {

	public static void main(String[] args) {

		Car car1 = new Sonata();
		car1.start();
		car1.drive();
		car1.stop();
		car1.turnOff();

		Car car2 = new Avante();
		car2.start();
		car2.drive();
		car2.stop();
		car2.turnOff();
	}
}

abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();

}

class Avante extends Car{
	
	@Override
	public void start() {
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

class Sonata extends Car{

	@Override
	public void start() {
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
