package object;

/* 학생이 택시에 타는 과정을 구현하세요.
 * 
 * 둘리 학생이 택시를 타고 학교에 갑니다.
 * 택시요금은 10000원을 지불했습니다.
 * 단, 소지금이 만원보다 적으면 택시에 탈수없습니다.
 * */
public class Quiz2 {

	public static void main(String[] args) {
		Student2 student = new Student2("둘리", 50000); // 5만원을 가진 둘리라는 학생을 만든다
		Taxi taxi = new Taxi("70합 1234"); // 70합 1234 차넘버의 택시를 만든다
		student.takeTaxi(taxi); // 둘리가 택시를 탄다
		student.showInfo(); // 둘리의 현재정보를 출력한다
		taxi.showInfo(); // 택시의 현재정보를 출력한다
	}
}

// 택시 클래스 구현하기
class Taxi {
	String taxiNumber; // 택시번호
	int money; // 수입

	// 택시번호를 초기화하는 생성자
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	// 택시에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
	}

	public void showInfo() {
		System.out.println("택시번호 " + taxiNumber + "의 수입은 " + money + "입니다.");
	}

}

// 학생클래스 구현하기
class Student2 {
	String studentName; // 학생이름
	int money; // 가진돈

	// 학생이름과 가진돈을 초기화하는 생성자
	public Student2(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	// 지하철에 타서 요금 10000원을 지불하는 메소드
	public void takeTaxi(Taxi taxi) {
		if (money < 10000) {
			System.out.println("소지금이 적어 택시를 탈 수 없습니다..");
			return;
		}
		taxi.take(10000); // 10000원 지불
		this.money = this.money - 10000; // 가진돈 10000원을 잃음
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}

}
