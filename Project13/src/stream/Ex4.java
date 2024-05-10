package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 스트림의 연산 - 최종연산
 * */
public class Ex4 {

	public static void main(String[] args) {

		// 배열 생성
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// 배열에서 기본형 스트림 생성
		IntStream stream1 = Arrays.stream(intArr);

		// forEach: 지정된 반복 작업을 수행
//		stream1.forEach(n -> System.out.println(n));

		// count: 스트림 요소의 개수 구하기
		IntStream stream2 = Arrays.stream(intArr);
		System.out.println(stream2.count());

		// sum: 스트림 요소의 합 구하기
		IntStream stream3 = Arrays.stream(intArr);
		System.out.println(stream3.sum()); // 기본형 스트림만 사용 가능

		// reduce: 초기값을 넣고, 반복 작업 수행
		IntStream stream4 = Arrays.stream(intArr);
		int result = stream4.reduce(10, (total, n) -> total + n);
		System.out.println(result);

		// 리스트 생성
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		// collect: 스트림을 다른 자료구조로 변환. stream -> set
		Stream<Integer> stream5 = list.stream();
		Set<Integer> set = stream5.collect(Collectors.toSet());

		// collect: 스트림을 다른 자료구조로 변환. stream -> list
		Stream<Integer> stream6 = list.stream();
		List<Integer> strList = stream6.collect(Collectors.toList());

	}

}
