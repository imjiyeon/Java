package inheritance;


//  아래 그림은 펜과 볼펜,만년필 클래스의 상속관계를 표현한 것입니다.
//  다음과 같이 클래스를 구현하고, 객체를 생성하세요.

public class Quiz3 {

	public static void main(String[] args) {
		Balpen balpen = new Balpen(); // 볼펜 생성
		balpen.width = 2; // 부모클래스에서 물려받은 속성
		balpen.amount = 100; // 부모클래스에서 물려받은 속성
		balpen.color = "blue";

		FountainPen fountainPen = new FountainPen(); // 만년필 생성
		fountainPen.width = 3; // 부모클래스에서 물려받은 속성
		fountainPen.amount = 80; // 부모클래스에서 물려받은 속성
		fountainPen.brand = "MONTBLANC";
	}

}

// 펜 클래스
class Pen {
	int width; // 펜의 굵기
	int amount; // 남은 양
}

// 볼펜 클래스
class Balpen extends Pen { // 상속받기
	String color; // 볼펜의 색
}

// 만년필 클래스
class FountainPen extends Pen { // 상속받기
	String brand; // 브랜드
}