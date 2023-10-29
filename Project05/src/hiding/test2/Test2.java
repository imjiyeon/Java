package hiding.test2;

//변수 접근범위 확인하기
public class Test2 {
	public static void main(String[] args) {
		Person person = new Person();
		person.name = "둘리";
		person.height = 170;
		// 몸무게는 클래스 외부에서 사용불가
	}
}

//사람을 정의하는 클래스 만들기
class Person {
	public String name; // 이름
	int height; // 키
	private double weight; // 몸무게

	public void showInfo() {
		System.out.println("이름:" + name + "키:" + height + "몸무게:" + weight);
		//몸무게는 클래스 내부에서만 사용 가능
	}
}