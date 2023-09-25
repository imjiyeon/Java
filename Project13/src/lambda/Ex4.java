package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 람다 활용하기2
 * 정렬 메소드 사용하기
 * */
public class Ex4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa", "ccc", "bbb");
		
		//sort 정렬메소드의 인자: 문자열 리스트, 리스트 정렬하는 로직을 가지고 있는 Comparator 클래스
		
		//1.익명클래스 넣기
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1); //문자 역정렬
			}
		});
		System.out.println("리스트 역정렬: " +list);

		//2.람다식 함수 넣기
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2)); //문자 순정렬
		System.out.println("리스트 순정렬: " +list);
	}

}
