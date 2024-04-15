package abstractex.quiz;

/*
 * 자동차,버스,오토카 클래스를 정의하세요.
 * 자동차클래스에서 상속받은 메소드를 재정의하세요.
 * 버스와 오토카에 메소드를 추가하세요.
 * */
public class Quiz2 {

	public static void main(String[] args) {

		Bus bus = new Bus(); // 변수의 자료형으로 Bus만 사용할 수 있음
		bus.run();
		bus.refuel();
		bus.takePassenger();
		System.out.println();

		AutoCar autoCar = new AutoCar(); // 변수의 자료형으로 AutoCar만 사용할 수 있음
		autoCar.run();
		autoCar.refuel();
		autoCar.load();

	}

}

//자동차 클래스
abstract class Car2 {
	
	// 자동차가 달리고, 기름을 넣는 기능은 모든 자동차가 가지고 있는 기능
	public abstract void run();

	public abstract void refuel();

}

// 버스 클래스
class Bus extends Car2 { // 상속받기

	@Override
	public void run() { // 물려받은 추상메소드 구현
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전 합니다.");
	}

	// 버스에 승객을 태우는 기능은 버스만 사용함
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
}

//오토카 클래스
class AutoCar extends Car2 {

	@Override
	public void run() { // 물려받은 추상메소드 구현
		System.out.println("자동차가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}

	// 차에 짐을 싣는 기능은 오토카만 사용함
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
}
