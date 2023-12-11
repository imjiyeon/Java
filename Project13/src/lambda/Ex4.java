package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 람다식 함수 활용하기 (2)
 * */
public class Ex4 {
	public static void main(String[] args) {

		// 문자열 리스트 생성
		List<String> list = new ArrayList<>();

		// 문자열 추가
		list.add("add");
		list.add("ccc");
		list.add("bbb");

		// 리스트를 순서대로 정렬하기

		// Collections.sort(): 리스트의 데이터를 순서대로 정렬하는 기능
		// 인자: 문자열 리스트, 리스트 정렬하는 로직을 가지고 있는 Comparator 클래스

		// 1.클래스에 메소드를 정의하고 사용
		Collections.sort(list, new ComparatorImpl());
		System.out.println("리스트 역정렬: " + list);

		// 2.람다식 함수 사용
		Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
		System.out.println("리스트 순정렬: " + list);
	}

}

class ComparatorImpl implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2); // 알파벳 순정렬. (비교해서 작은 알파벳이 앞으로 옴)
	}

}
