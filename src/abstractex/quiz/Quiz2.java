package abstractex.quiz;

/*
 * Car 추상클래스 내용 확인
 * Test 클래스 결과를 확인하여 다음과 같이 결과가 출력되도록
 * Car 추상클래스를 상속받아 Bus클래스와 AutoCar클래스를 생성하시오
 * */
public class Quiz2 {

	public static void main(String[] args) {
		
		Bus bus = new Bus();
		bus.run();
		bus.refuel();
		bus.takePassenger();
		System.out.println();
		
		AutoCar autoCar = new AutoCar();
		autoCar.run();
		autoCar.refuel();
		autoCar.load();

	}

}

abstract class Car2 {

	//추상메소드
	public abstract void run();
	public abstract void refuel();

}

class AutoCar extends Car2{

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");		
	}

	@Override
	public void refuel() {
		System.out.println("휘발유를 주유합니다.");
	}

	public void load() {
		System.out.println("짐을 싣습니다.");
	}
}

class Bus extends Car2{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전 합니다.");
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
}
