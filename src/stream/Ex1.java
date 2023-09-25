package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//배열에서 스트림 사용하기
public class Ex1 {

	public static void main(String[] args) {
		
		int[] intArr = {1,5,3,2,4};
		//기본형 스트림은 IntStream, LongStream, DoubleStream을 사용
		IntStream stream1 = Arrays.stream(intArr); //배열에서 스트림 생성
		//중간연산-limit,sorted (반복사용가능)
		//최종연산-forEach (1번만사용가능)
		stream1.limit(3).sorted().forEach(n->System.out.println(n)); //요소를 3개 자르고, 정렬하고, 요소를 하나씩 출력
		
		//첫번째 스트림을 사용이 끝나서 닫힘. 새로운 연산을 할때는 다시 스트림을 생성해야함
		String[] strArr = {"abcde","abc","cdefgh"};
		Stream<String> stream2 = Arrays.stream(strArr); //배열에서 스트림 생성
		long count = stream2.filter(s-> s.length() >= 5).count(); //크기가 5상인 문자을 찾고, 요소의 개수 출력
		System.out.println("배열에서 크기가 5이상인 문자열은 " + count + "개 입니다");
	}

}
