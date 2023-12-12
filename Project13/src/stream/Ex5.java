package stream;

import java.util.ArrayList;
import java.util.List;

/*
 * 패키지 여행을 떠나는 고객 정보를 저장하는 Customer 클래스를 만든다.
 * 속성: 이름,나이,여행비용
 * 
 * 여행 고객 리스트를 만들고, 고객을 추가한다.
 * (둘리, 40살, 여행비용 100만원), (또치, 13살, 여행비용 50만원), (도우너, 25살, 여행비용 70만원)
 * 
 * 고객 리스트를 사용하여 다음과 같은 정보를 출력한다.
 * - 고객의 명단
 * - 여행의 총 비용
 * - 20세 이상의 고객을 찾아서 이름을 출력
 * */
public class Ex5 {

	public static void main(String[] args) {

		Customer customer1 = new Customer("둘리", 40, 100);
		Customer customer2 = new Customer("또치", 13, 50);
		Customer customer3 = new Customer("도우너", 25, 70);

		List<Customer> customerList = new ArrayList<>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);

		System.out.println("== 고객 명단 ==");
		customerList.stream()
						.map(c -> c.name)
						.forEach(s -> System.out.println(s));

		int total = customerList.stream()
						.mapToInt(c -> c.budget)
						.sum();
		System.out.println("총 여행 비용 :" + total);

		System.out.println("== 20세 이상 고객 명단 ==");
		customerList.stream()
						.filter(c -> c.age >= 20)
						.map(c -> c.name)
						.sorted()
						.forEach(s -> System.out.println(s));
	}
}

// 고객 클래스
class Customer {

	String name;   //이름
	int age;       //나이
	int budget;    //여행비용
	
	public Customer(String name, int age, int budget) {
		this.name = name;
		this.age = age;
		this.budget = budget;
	}

}
