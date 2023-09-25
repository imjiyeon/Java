package stream.quiz;

import java.util.ArrayList;
import java.util.List;

/*
 * 패키지 여행을 떠나는 고객들이 있다. 
 * 고객의 정보는 TravelCustomer 클래스에 담는다. (이름,나이,여행비용)
 * 그리고 TravelCustomer형 리스트에 고객 명단을 담는다.
 * 고객 명단 : (둘리, 40살, 여행비용 100만원), (또치, 13살, 여행비용 50만원), (도우너, 25살, 여행비용 70만원)
 * 고객 리스트로 다음과 같은 정보를 출력한다.
 * 1. 고객의 명단 출력
 * 2. 여행의 총 비용 출력
 * 3. 20세 이상 고객을 찾고 이름으로 정렬하여 출력
 * */
public class Quiz1 {

	public static void main(String[] args) {
		
		TravelCustomer customerLee = new TravelCustomer("둘리", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("또치", 13, 50);
		TravelCustomer customerHong = new TravelCustomer("도우너", 25, 70);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		//1.
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		customerList.stream()
			.map(c->c.getName())
			.forEach(s->System.out.println(s));
		
		//2.
		int total = customerList.stream()
				.mapToInt(c->c.getBudget())
				.sum();
		System.out.println("총 여행 비용 :" + total);
		
		//3.
		System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
		customerList.stream()
			.filter(c->c.getAge() >= 20).map(c->c.getName()).sorted()
			.forEach(s->System.out.println(s));
	}
}
