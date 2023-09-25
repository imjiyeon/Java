package thisex;

/*
 * this 출력하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000); //태어난 연도를 2000으로 지정
		System.out.println(bDay); //참조 변수 출력
		bDay.printThis(); //this 출력메소드 호출
	}
}

class BirthDay{

	int day;
	int month;
	int year;
	
	public void setYear(int year) { //태어난 연도를 지정하는 메소드
		this.year = year; //멤버변수 = 지역변수
	}
	
	public void printThis() { //this 출력 메소드
		System.out.println(this);  
	}
}