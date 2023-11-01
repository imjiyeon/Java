package typecasting;

/* 
 * 상속에서 클래스가 생성되는 과정 보기
 * */
public class Ex1 {

	public static void main(String[] args) {
		
		VIPCustomer vip = new VIPCustomer(); //하위 클래스 생성
		//상위 클래스의 생성자가 먼저 호출되고 그다음에 자식클래스의 생성자가 호출되는 것을 볼 수 있음
		//정리하면 상위클래스의 생성자가 호출될 때 상위클래스의 멤버변수가 되는 것
	}
}


//상속패키지에서 Customer와 VIP 클래스 복사
class Customer {
	String customerName;
	String customerGrade;
	double bonusPoint;
	double bonusRatio;

	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출"); //상위 클래스 생성할 때 콘솔창에 출력하기 (추가)
	}

	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		System.out.println(customerName+"님이 " + price + "원을 결제했습니다.");
	}
	
	public void showCustomerInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.");
	}

}

class VIPCustomer extends Customer {
	
	double saleRatio;

	public VIPCustomer() {
		super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() 생성자 호출"); //하위 클래스 생성할 때 콘솔창에 출력하기 (추가)
	}

}