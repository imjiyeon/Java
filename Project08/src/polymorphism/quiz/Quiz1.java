package polymorphism.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		runCar(new Bus());
		runCar(new SportsCar());
	}

	public static void runCar(Bus bus) {
		bus.run();
	}

	public static void runCar(SportsCar sportsCar) {
		sportsCar.run();
	}
	
	//다형성을 활용한다면 부모타입 매개변수를 사용해서 메소드를 한번만 선언하면됨
//	public static void runCar(Car car) {
//		car.run(); //위의 2개 메소드를 사용한 것과 같은 결과가 출력됨
//	} 
}

class Car {
	public void run() {
		System.out.println("자동차가 달린다");
	}
}

class Bus extends Car {

	@Override
	public void run() {
		System.out.println("버스가 달린다");
	}
	
}

class SportsCar extends Car {
	@Override
	public void run() {
		System.out.println("스포츠카가 달린다");
	}
}
