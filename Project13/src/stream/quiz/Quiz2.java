package stream.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// 다음과 같이 쇼핑몰의 거래내역을 저장하는 클래스를 만드세요
// 속성: 주문번호, 주문연도, 거래내역(만원단위)
// [orderNo=1001, year=2022, price=300]
// [orderNo=1002, year=2022, price=150]
// [orderNo=1003, year=2022, price=200]
// [orderNo=1004, year=2023, price=500]
// [orderNo=1005, year=2023, price=400]
// [orderNo=1006, year=2023, price=600]
// [orderNo=1007, year=2023, price=650]
//
// 1.모든 거래번호를 한줄에 나열하세요.
// 결과: 1001 1002 1003 1004 1005 1006 1007
// 2.2022년도의 거래 총금액과 건수를 출력하세요
// 결과: 총금액:650, 거래건수:3
// 3.2023년도의 거래 총금액과 건수를 출력하세요
// 결과: 총금액:2150, 거래건수:4


public class Quiz2 {

	public static void main(String[] args) {
		
		// 거래내역 리스트 생성
		List<Order> list = new ArrayList<>();
		
		list.add(new Order(1001, 2022, 300));
		list.add(new Order(1002, 2022, 150));
		list.add(new Order(1003, 2022, 200));
		list.add(new Order(1004, 2023, 500));
		list.add(new Order(1005, 2023, 400));
		list.add(new Order(1006, 2023, 600));
		list.add(new Order(1007, 2023, 650));
		
		// 모든 거래번호를 한줄에 나열하세요.
		// -> 1001 1002 1003 1004 1005 1006 1007
		Stream<Order> stream1 = list.stream();
		stream1.map(o -> o.orderNo).forEach(s-> System.out.print(s + " "));
		System.out.println();
		
		// 2022년도의 거래 총금액과 건수를 출력하세요
		// -> 총금액: 650, 거래건수: 3
		Stream<Order> stream2 = list.stream();
		int sum1 = stream2.filter(o -> o.year == 2022).mapToInt(o -> o.price).sum();
		System.out.println("2022년도의 거래 총금액: " + sum1);
				
		Stream<Order> stream3 = list.stream();
		long count1 = stream3.filter(o -> o.year == 2022).count();
		System.out.println("2022년도의 거래건수: " + count1);
		
		// 2023년도의 거래 총금액과 건수를 출력하세요
		// -> 총금액: 2150, 거래건수: 4
		Stream<Order> stream4 = list.stream();
		int sum2 = stream4.filter(o -> o.year == 2023).mapToInt(o -> o.price).sum();
		System.out.println("2023년도의 거래 총금액: " + sum2);
		
		Stream<Order> stream5 = list.stream();
		long count2 = stream5.filter(o -> o.year == 2023).count();
		System.out.println("2023년도의 거래건수: " + count2);		
						
	}

}

// 쇼핑몰 거래내역 클래스
class Order {

	int orderNo; // 주문번호
	int year; // 주문연도
	int price; // 거래금액 (만원)

	public Order(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}

}