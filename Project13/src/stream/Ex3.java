package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 스트림의 연산 - 중간연산
 * */
public class Ex3 {

	public static void main(String[] args) {

		// 리스트 생성
		List<Integer> list = Arrays.asList(1, 1, 2, 3, 5, 4);

		// 리스트로부터 스트림 생성
		Stream<Integer> stream1 = list.stream();

		// distinct()은 중복을 제거하고 새로운 자료를 생성함 
		// forEach()은 요소를 하나씩 차례대로 n에 대입하고, n을 사용하여 출력함
		stream1.distinct().forEach(n -> System.out.print(n + " "));

		// filter: 조건에 맞는 결과를 추출. 2의 배수만 추출
		list.stream()
				.filter(n -> n % 2 == 0)
				.forEach(n -> System.out.print(n + " "));

		// limit: 요소를 3개만 추출
		list.stream()
				.limit(3)
				.forEach(n -> System.out.print(n + " "));

		// sorted: 순서대로 정렬
		list.stream()
				.sorted()
				.forEach(n -> System.out.print(n + " "));

		// 역순으로 정렬하고 출력
		list.stream()
				.sorted(Comparator.reverseOrder())
				.forEach(n -> System.out.print(n + " "));

		// Stream<Integer>을 기본형 스트림 IntStream 으로 변경
		// mapToInt: 값을 int형으로 변환
		Stream<Integer> stream2 = list.stream();

		IntStream intStream = stream2.mapToInt(n -> n.intValue());

		// Stream은 sum, count 같은 함수를 사용할 수 없음
		System.out.println(intStream.sum());

		// map: 값을 다른 값으로 변경. 문자을 대문자로 변경
		List<String> strList = Arrays.asList("aaa", "bbb", "ccc");

		strList.stream()
				.map(s -> s.toUpperCase())
				.forEach(s -> System.out.print(s + " "));

		// map: 값을 다른값으로 변경. 문자을 문자의 길이로 변경
		strList.stream()
				.map(s -> s.length())
				.forEach(s -> System.out.print(s + " "));

		// 도서 리스트에서 도서의 제목만 가져와서 출력하기
		List<Book> list2 = new ArrayList<>();
		list2.add(new Book("자바프로그래밍", 10000));
		list2.add(new Book("스프링프로젝트", 20000));
		
		list2.stream().map(b -> b.title).forEach(s -> System.out.println(s));

	}

}

// 도서 클래스
class Book {
	String title; // 제목
	int price; // 가격
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	
}
