package object;

/* 
 * 학생이 대중교통을 타고 학교에 가는 상황을 구현하세요.
 * 
 * 학생 두 명을 생성하세요. (둘리,5000)(도우너,10000)
 * 둘리는 100번버스를 타고 학교에 갑니다.
 * 도우너는 2호선 지하철을 타고 학교에 갑니다.
 * 학생,버스,지하철의 현재 정보를 출력하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		Student student1 = new Student("둘리", 5000); // 만원을 가진 도우너이라는 학생을 만든다
		Bus bus = new Bus(100); // 100번 버스를 만든다
		student1.takeBus(bus); // 둘리가 100번 버스에 탄다
		student1.showInfo(); // 둘리의 현재정보를 출력한다
		bus.showInfo(); // 버스의 현재정보를 출력한다

		Student student2 = new Student("도우너", 10000); // 만원을 가진 도우너라는 학생을 만든다
		Subway subway = new Subway("2호선"); // 노선번호가 2호선인 지하철을 만든다
		student2.takeSubway(subway);
		student2.showInfo();
		subway.showInfo();
	}
}
