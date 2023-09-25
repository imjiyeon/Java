package inheritance.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		Balpen balpen = new Balpen(); //볼펜 생성
		balpen.width = 2;
		balpen.amount = 100;
		balpen.color = "blue";
		
		FountainPen fountainPen = new FountainPen(); //만년필 생성
		fountainPen.width = 3;
		fountainPen.amount = 80;
		fountainPen.brand = "MONTBLANC";
	}

}

class Pen {
	int width; // 펜의 굵기
	int amount; // 남은 양

}

class Balpen extends Pen { // 볼펜
	String color; // 볼펜의 색
}

class FountainPen extends Pen { // 만년필
	String brand; // 브랜드
}