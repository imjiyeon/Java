package thisex;

/*
 * this 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {

		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); // 태어난 연도 변경
		System.out.println(bDay); // 변수 bDay 출력
		bDay.printThis(); // 변수 this 출력. 위와 같은 값이 출력됨
	}
}

class BirthDay {
	int year;

	// 태어난 연도를 변경하는 메소드
	public void setYear(int year) {
		this.year = year; // 변수의 이름이 같을 때, this를 사용해서 구분할 수 있음
	}

	// this의 값을 출력하는 메소드
	public void printThis() {
		System.out.println(this);
	}
}