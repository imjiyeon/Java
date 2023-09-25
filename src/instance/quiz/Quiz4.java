package instance.quiz;

/* 
 * 자동차 클래스를 설계한다
 * boolean타입의 자동차의 현재상태를 저장하는 멤버변수를 만든다 (true - 달리는상태, false- 정지상태를 의미)
 * 현재상태를 변경하는 메소드를 만든다
 * 현재상태를 가져오는 메소드를 만든다
 * 현재상태를 출력하는 메소드를 만든다
 * 
 * 자동차 인스턴스를 만들고 현재상태를 달리는 상태로 변경한다.
 * 그리고 자동차의 현재상태를 출력한다
 * */
public class Quiz4 {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.setStatus(false);
		System.out.println("현재상태 :" + car.getStatus());
		car.showStatus();
	}

}

class Car{
	static boolean status; //현재상태

	// 현재상태를 가져오는 함수 선언
	public boolean getStatus() {
		return status;
	}
	// 현재상태를 변경하는 함수 선언
	public void setStatus(boolean stt) { 
		status = stt;
	}
	//현재 상태를 출력하는 함수 선언
	public void showStatus() {
		System.out.println(status);
	}
}
