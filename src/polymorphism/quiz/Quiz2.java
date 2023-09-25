package polymorphism.quiz;

import java.util.ArrayList;

/* 
 * 새로운 회원 등급을 추가한다.
 * 등급: GOLD
 * 혜택: 보너스적립률 2% 할인률 10%
 * 
 * 배열을 생성하여 SILVER/GOLD/VIP 회원을 1명씩 총 3명 저장한다.
 * 그리고 모든 회원이 10000원짜리 상품을 결제한다.
 * 이후 회원의 정보를 출력한다.
 * */
public class Quiz2 {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>(); //자료형을 Customer로 지정한다

		customerList.add(new Customer("둘리"));
		customerList.add(new GoldCustomer("또치"));
		customerList.add(new VIPCustomer("도우너"));

		System.out.println("====== 회원등급에따라 할인율과 보너스 포인트 계산 =======");

		for (Customer customer : customerList) {
			System.out.println(customer.customerName + " 님이 " + customer.calcPrice(10000) + "원 지불하였습니다.");
		}
		
		for (Customer customer : customerList) {
			customer.showCustomerInfo();
		}

	}
}

//예제 3번의 Customer와 VIP클래스 복사
class Customer {
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	public int calcPrice(int price) {
		bonusPoint = (int) (bonusPoint + (price * bonusRatio));
		return price;
	}

	public void showCustomerInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer extends Customer {

	double saleRatio;

	public VIPCustomer(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint = (int)(bonusPoint + (price * bonusRatio));
		return price - (int) (price * saleRatio);
	}
}

/*
 * 새로운 등급 만들기
 * */
class GoldCustomer extends Customer {

	double saleRatio;

	public GoldCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02; // 2퍼센트 적립
		saleRatio = 0.1; // 10퍼센트 할인
	}

	//재정의한 메소드
	@Override
	public int calcPrice(int price) {
		bonusPoint = (int) (bonusPoint + (price * bonusRatio));
		return price - (int) (price * saleRatio);
	}
}
