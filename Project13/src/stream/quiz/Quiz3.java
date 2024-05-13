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


public class Quiz3 {

	// map 함수의 인자는 Function
	// 인터페이스를 구현하는 방법은 3가지
	// 함수형 인터페이스는 람다식 함수로 구현 가능
	// Function 인터페이스를 람다식 함수로 구현하기
	// 1.추상메소드 구현한다 2.람다식함수로 바꾼다

	// 이함수는 요소를 다른값으로 바꿔서 반환하는 함수
	// 리턴타입 R? 제네릭 타입이라는거. 여러분들이 정해주시면 됨

//	R apply(T t) { //요소는 주문 객체
//		return t.orderNo; //주문 번호로 바꿔서 반환
//	}

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

		// map: 값을 다른 값으로 변경 (주문이력 -> 주문번호)
		// forEach: 특정작업을 반복적으로 수행 (출력)

		Stream<Order> stream1 = list.stream();
		stream1
				.map(o -> o.orderNo)
				.forEach(s-> System.out.print(s + " "));

		// 2022년도의 거래 총금액과 건수를 출력하세요
		// 총금액: 650, 거래건수: 3

		// filter: 조건을 만족하는 요소만 추출 (년도가 2022년도인)
		// mapToInt: 값을 int형으로 변환 (Order객체 -> int타입의 price필드)
		// sum: 스트림 요소의 합 구하기 (거래금액의 합계)
		int sum1 = list.stream()
				.filter(o -> o.year == 2022)
				.mapToInt(o -> o.price)
				.sum();
		System.out.println("2022년도의 거래 총금액: " + sum1);

		// filter: 조건을 만족하는 요소만 추출 (년도가 2022년도인)
		// count: 스트림 요소의 개수 구하기 (거래건수)
		long count1 = list.stream()
				.filter(o -> o.year == 2022)
				.count();
		System.out.println("2022년도의 거래건수: " + count1);

		// 2023년도의 거래 총금액과 건수를 출력하세요
		// 총금액: 2150, 거래건수: 4
		int sum2 = list.stream()
				.filter(o -> o.year == 2023)
				.mapToInt(o -> o.price)
				.sum();
		System.out.println("2023년도의 거래 총금액: " + sum2);

		long count2 = list.stream()
				.filter(o -> o.year == 2023)
				.count();
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