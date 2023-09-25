package instance.quiz;
 
/* 
 * 2. 다음과 같이 Order 클래스 만든다
 *    주문번호, 주문날짜, 주문자이름, 배송지로 가진다.
 *    모든 멤버변수 정보를 출력하는 showOrderInfo 함수를 가진다.
 *    
 *    그리고 다음 정보를 가지는 인스턴스를 생성한다. 
 *    - 주문번호:1111
 *    - 주문날짜:2018년3월12일
 *    - 주문자이름:둘리
 *    - 배송주소:서울시 영등포구 여의도동 20번지
 * */
public class Quiz2 {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderId = 1111;
		order.orderDate = "2018년 3월 12일"; 
		order.customerName = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		order.showOrderInfo();	
	}
}

class Order {
	int orderId;
	String orderDate;  //날짜는 Date 클래스를 많이 사용하지만, 여기서는 일단 String으로
	String customerName;
	String address;
	
	public void showOrderInfo() {
		System.out.println("주문번호:" + orderId + ", 주문날짜:" + orderDate + ", 주문자이름: " + customerName + ", 배송지:" + address);
	}

}
