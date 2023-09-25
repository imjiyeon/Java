package object.quiz;

/* 먼저 Ex1 클래스를 복사하세요
 * 학생 두명을 생성하세요 
 * (둘리,5000 / 도우너,10000)
 * 둘리는 100번버스를 타고 학교에 갑니다
 * 도우너는 2호선 지하철을 타고 학교에 갑니다
 * 
 * 이제 모든 학생,버스,지하철의 현재정보를 출력하세요
 * */
public class Quiz1 {

	public static void main(String[] args) {
		Student student1 = new Student("둘리", 5000); // 만원을 가진 도우너이라는 학생을 만든다
		Bus bus100 = new Bus(100); // 100번 버스를 만든다
		student1.takeBus(bus100); // 둘리가 100번 버스에 탄다
		student1.showInfo(); //둘리, 100버스의 현재정보를 출력한다
		bus100.showInfo();
		
		Student student2 = new Student("도우너", 10000); // 만원을 가진 도우너라는 학생을 만든다
		Subway subway2 = new Subway("2호선"); // 노선번호가 2호선인 지하철을 만든다
		student2.takeSubway(subway2);
		student2.showInfo();
		subway2.showInfo();
	}
}

/* 버스클래스 구현하기 */ 
class Bus {
	int busNumber; //버스번호
	int passengerCount; //승객수
	int money; //버스의수입

	//버스번호를 초기화하는 생성자
	public Bus(int busNumebr)
	{
		this.busNumber = busNumebr;
	}
	
	//버스에 승객을 태우는 메소드
	public void take(int money)
	{
		this.money = this.money + money; //버스 수입 증가
		passengerCount++; //승객수 1명 증가
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}

/* 지하철 클래스 구현하기 */
class Subway {
	public String lineNumber; //지하철 노선번호
	public int passengerCount; //승객수
	public int money; //지하철수입

	// 지하철 노선번호를 초기화하는 생성자
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	//지하철에 승객을 태우는 메소드
	public void take(int money)
	{
		this.money = this.money + money;
		passengerCount++;
	}
	
	public void showInfo(){
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}

/* 학생클래스 구현하기 */
class Student {
	public String studentName; //학생이름
	public int money; //가진돈

	//학생이름과 가진돈을 초기화하는 생성자
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	//버스에 타서 요금 1000원을 지불하는 메소드
	public void takeBus(Bus bus) {
		bus.take(1000); //1000원 지불
		this.money = this.money - 1000; //가진돈 1000원을 잃음
	}

	//지하철에 타서 요금 1500원을 지불하는 메소드
	public void takeSubway(Subway subway) {
		subway.take(1500); //1500원 지불
		this.money = this.money - 1500; //가진돈 1500원을 잃음
	}

	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}

}
