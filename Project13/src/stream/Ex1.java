package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * 스트림 만들기
 * */
public class Ex1 {

	public static void main(String[] args) {

		// 리스트로부터 스트림 생성하기
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // 리스트 생성
		Stream<Integer> stream1 = list.stream();

		// 객체 배열로부터 스트림 생성하기
		String[] strArr = { "a", "b", "c" };
		Stream<String> stream2 = Stream.of(strArr);
		Stream<String> stream3 = Arrays.stream(strArr);

		// 기초 배열로부터 기본형 스트림 생성하기
		int[] intArr = { 1, 2, 3, 4, 5 };
		IntStream stream4 = Arrays.stream(intArr); // Stream<Integer>가 아니라 IntStream이 반환됨

		// 기본형 스트림은 오토박싱/언박싱하지 않고 연산을 수행하여 속도가 더 빠름

	}

}
