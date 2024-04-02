package instance;

//  자동차 클래스 만들고, 함수로 값 변경하기
public class Ex3 {

	public static void main(String[] args) {
		Car car = new Car();
		car.setStatus(true);
		car.showStatus(); // 현재상태 출력
	}
}

class Car {
	boolean status; // 현재상태

	// 현재상태를 변경하는 메소드 선언
	public void setStatus(boolean stt) {
		status = stt;
	}

	// 현재 상태를 출력하는 메소드 선언
	public void showStatus() {
		System.out.println(status);
	}
}
