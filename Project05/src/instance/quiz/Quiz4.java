package instance.quiz;

/* 
 * 다음과 같이 자동차클래스(Car)를 정의하세요.
 * 현재상태를 속성으로 갖습니다. (true - 달리는상태, false- 정지상태를 의미)
 * 현재상태를 변경하는 메소드, 현재상태를 가져오는 메소드, 현재상태를 출력하는 메소드를 갖습니다.
 *
 * 그리고 Car 클래스를 사용하여 인스턴스를 생성합니다.
 * 달리는 상태로 변경하고, 자동차의 현재상태를 출력하세요.
 * */
public class Quiz4 {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.setStatus(true);
		car.showStatus(); //현재상태 출력
	}

}

class Car{
	static boolean status; //현재상태

	// 현재상태를 가져오는 메소드 선언
	public boolean getStatus() {
		return status;
	}
	// 현재상태를 변경하는 메소드 선언
	public void setStatus(boolean stt) { 
		status = stt;
	}
	//현재 상태를 출력하는 메소드 선언
	public void showStatus() {
		System.out.println(status);
	}
}
