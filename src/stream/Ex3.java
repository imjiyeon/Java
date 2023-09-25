package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//스트림의 특징
public class Ex3 {

	public static void main(String[] args) {
		
		//한번 생성하고 사용한 스트림은 재사용할 수 없다
		List<Integer> list = Arrays.asList(5,1,2,4,3);		
		Stream<Integer> stream = list.stream(); //리스트에서 스트림 생성
		int sum = stream.mapToInt(n->n.intValue()).sum(); //integer->int로 변환하고 합을 구함	
//		stream.count(); //에러남. 이미 스트림이 소모되어 닫혔음
		
		//스트림 연산은 기존자료를 변경하지 않는다
		list.stream().sorted().forEach(n->System.out.println(n)); //정렬
		System.out.println("스트림 정렬 후 리스트: " + list); //원본데이터는 그대로
		
		//중간연산은 여러번 적용 할 수 있고, 최종연산은 마지막에 한번만 적용된다
		list.stream().filter(n->n >=3).sorted().forEach(n->System.out.println(n)); 
	}

}
