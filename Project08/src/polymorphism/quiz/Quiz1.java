package polymorphism.quiz;

/*
 * 자동차, 버스, 스포츠카 클래스를 정의하세요.
 * 자동차 클래스에서 상속받는 메소드를 재정의하세요 run()
 * 버스와 스포츠카 객체를 매개변수로 받는 메소드를 정의하고 run()메소드를 호출하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		runCar(new Bus()); // Car car = new Bus() 식이 성립됨
		runCar(new SportsCar());
	}

	public static void runCar(Car car) { // 자식클래스인 버스,스포츠카를 받을 수 있음
		car.run(); // 재정의된 메소드가 호출됨
	}

	// 만약 다형성을 활용하지 않는다면 각 클래스를 매개변수로 사용하는 메소드를 만들어야함
//	public static void runCar(Bus bus) {
//		bus.run();
//	}
//
//	public static void runCar(SportsCar sportsCar) {
//		sportsCar.run();
//	}

}

// 자동차 클래스
class Car {
	public void run() {
		System.out.println("자동차가 달린다");
	}
}

// 버스 클래스
class Bus extends Car { // 상속받기

	@Override
	public void run() { // 메소드 재정의
		System.out.println("버스가 달린다");
	}

}

// 스포츠카 클래스
class SportsCar extends Car { // 상속받기
	@Override
	public void run() { // 메소드 재정의
		System.out.println("스포츠카가 달린다");
	}
}
