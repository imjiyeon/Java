package staticex.quiz;

/*
 * 카드회사에서 카드를 발급하는 프로그램을 구현한다.
 * 클래스변수를 사용해서 카드번호는 각자 고유한 번호로 부여한다.
 * 단, 카드번호는 100번부터 시작한다.
 * 
 * Card 클래스를 만들고 카드 세개를 생성한다.
 * 그리고 세 카드의 카드정보를 출력한다.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		Card card1 = new Card("둘리", "VIP");
		card1.showInfo();
		
		Card card2 = new Card("또치", "SILVER");
		card2.showInfo();
		
		Card card3 = new Card("도우너", "SILVER");
		card3.showInfo();
	}
}

class Card {
	
	static int serialNum = 100;
	int cardNo; //카드번호
	String name; //이름
	String grade; //등급
	
	public Card(String name, String grade) {
		super();
		this.cardNo = serialNum; //카드번호에 시리얼번호를 대입한다
		this.name = name;
		this.grade = grade;
		serialNum++; //카드를 발급할 때마다 시리얼번호는 1 증가한다
	}

	public void showInfo() {
		System.out.println("카드번호:" + cardNo + ", 이름:" + name + ", 등급: " + grade);
	}

}
