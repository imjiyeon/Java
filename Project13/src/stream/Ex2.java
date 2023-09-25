package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//리스트에서 스트림 사용하기
public class Ex2 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Tomas");
		list.add("Edward");
		list.add("Jack");
		
		//객체 타입의 스트림은 Stream<>를 사용한다
		Stream<String> stream1 = list.stream();

		//먼저 리스트에서 스트림 생성
		//크기가 5이상인 요소만 자르고, 정렬하고, 요소를 하나씩 출력
		stream1.filter(s->s.length() >= 5).sorted().forEach(s->System.out.println(s));

		//요소의 문자열 크기를 구하고 하나씩 출력
		System.out.println();
		list.stream().map(s->s.length()).forEach(n->System.out.println(n));	

	}

}
