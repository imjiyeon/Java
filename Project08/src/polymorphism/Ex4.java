package polymorphism;

import java.util.ArrayList;

/* 
 * 리스트와 다형성을 활용하여 회원 관리 프로그램 구현하기
 * */
public class Ex4 {

	public static void main(String[] args) {

		// 회원을 담을 리스트 생성
		ArrayList<Customer> customerList = new ArrayList<Customer>(); //리스트 자료형을 Customer로 지정

		Customer customer1 = new Customer("둘리"); //일반 회원 생성
		Customer customer2 = new Customer("또치");
		Customer customer3 = new Customer("도우너");
		Customer customer4 = new VIPCustomer("마이콜"); //vip 회원 생성
		Customer customer5 = new VIPCustomer("고길동");

		customerList.add(customer1); //리스트에 회원 추가
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);

		System.out.println("====== 회원등급에따라 할인율과 보너스 포인트 계산 =======");
		for (Customer customer : customerList) { // 배열의 요소를 하나씩 Customer형으로 꺼내기
			customer.calcPrice(10000); //실제 인스턴스에따라 재정의된 메소드 호출
		}
		
		for (Customer customer : customerList) {
			customer.showInfo(); //고객정보 출력
		}

	}
}

//예제 3번에 있는 Customer와 VIP클래스 사용하기

