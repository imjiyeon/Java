package inheritance;

/*
 * 상속을 사용하여 회원관리 프로그램 구현하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		//일반회원
		Customer customer = new Customer();
		customer.customerName = "둘리";
		System.out.println("둘리님이 " + customer.calcPrice(10000) + "를 결제했습니다");
		customer.showCustomerInfo();
		//vip회원
		VIPCustomer vip = new VIPCustomer();
		vip.customerName = "또치"; //부모클래스에서 물려받은 속성
		System.out.println("또치님이 " + vip.calcPrice(10000) + "를 결제했습니다"); // 결제금액이 할인되지않았음! 이문제는 오버라이드에서 다시 볼게요~
		vip.showCustomerInfo();
	}
}

/*
 * 일반회원 클래스 구현하기
 * */
class Customer {
	String customerName; //회원 이름
	String customerGrade; //회원 등급
	int bonusPoint; //보너스 포인트
	double bonusRatio; //적립 비율

	public Customer() {
		customerGrade = "SILVER"; //기본등급
		bonusRatio = 0.01; //기본 적립 비율
	}

	//보인스 포인트 적립하고, 지불 가격을 계산하는 메소드
	public int calcPrice(int price){
		bonusPoint = (int)(bonusPoint + (price * bonusRatio)); //보너스 포인트 계산
		return price;
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

/*
 * VIP 회원 클래스 구현하기 
 * */
class VIPCustomer extends Customer { //VIPCustomer클래스는 Customer클래스를 상속받음
	
	double saleRatio; //할인률

	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

}

