package object;

/* 손님이 카페에서 커피를 사는 과정 구현하세요.
 * 
 * 10000원을 가진 둘리는 별다방 카페에서 4000원을 내고 아메리카노를 샀습니다.
 * 20000원을 가진 또치는 별다방 카페에서 4500원을 내고 라떼를 샀습니다.
 * 단, 소지금이 가격보다 적으면 커피를 살 수 없습니다.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		Customer customer1 = new Customer("둘리", 10000);
		Cafe starCafe = new Cafe("별다방");
		customer1.buyAmericano(starCafe);
		customer1.showInfo(); // 둘리의 현재 정보 출력

		Customer customer2 = new Customer("또치", 20000);
		customer2.buyCaffelatte(starCafe);
		customer2.showInfo();

		starCafe.showInfo(); // 카페의 현재 정보 출력
	}
}

// 카페 클래스
class Cafe {
	String cafeName; // 카페이름
	int money; // 매상

	// 카페이름을 초기화하는 생성자
	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

	// 손님에게 커피를 파는 메소드
	public void sellCoffee(int money) {
		this.money = this.money + money;
	}

	public void showInfo() {
		System.out.println("카페 " + cafeName + "의 수입은 " + money + "입니다.");
	}

}

// 손님클래스
class Customer {
	String name; // 이름
	int money; // 소지금

	// 손님의이름과 가진돈을 초기화하는 생성자
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}

	// 카페에서 아메리카노를 사고 4000원을 지불하는 메소드
	public void buyAmericano(Cafe cafe) {
		if (money < 4000) {
			System.out.println(name + "의 소지금이 적어 커피를 살 수 없습니다..");
			return;
		}
		cafe.sellCoffee(4000);
		this.money = this.money - 4000;
	}

	// 카페에서 라떼를 사고 4500원을 지불하는 메소드
	public void buyCaffelatte(Cafe cafe) {
		if (money < 4500) {
			System.out.println(name + "의 소지금이 적어 커피를 살 수 없습니다..");
			return;
		}
		cafe.sellCoffee(4500);
		this.money = this.money - 4500;
	}

	public void showInfo() {
		System.out.println(name + "의 남은 돈은 " + money + "입니다.");
	}
}
