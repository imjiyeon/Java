package constructor;

//  자동차(Car)을 정의하는 클래스를 만드세요.
//  속성: 제조사, 모델명, 색, 최고속도
//  생성자: 디폴트 생성자, 모든 멤버변수를 입력받는 생성자
//
//  모든 생성자를 사용하여 두개의 인스턴스를 생성하고 모든 값을 초기화하세요
//  (현대, 쏘나타, 흰색, 200)
//  (기아, 레이, 검정색, 150)

public class Quiz2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.company = "현대";
		car1.model = "쏘나타";
		car1.color = "흰색";
		car1.maxSpeed = 200;
		
		Car car2 = new Car("기아", "레이", "검정색", 150);
	}
}

class Car {
	String company; //제조사
	String model; //모델
	String color; //색
	int maxSpeed; //최고속도
	
	public Car() {
	}
	
	public Car(String company, String model, String color, int maxSpeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
