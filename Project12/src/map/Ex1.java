package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * int형 키, String형 value를 가지는 HashMap 객체 생성하기
 * */
public class Ex1 {

	public static void main(String[] args) {

		// int형 키, String형 value를 저장하는 맵 생성
		HashMap<Integer, String> map = new HashMap<>();

		// 데이터 추가
		map.put(1, "사과"); // key, value 쌍으로 값 추가
		map.put(2, "바나나");
		map.put(3, "코코넛");
		System.out.println("hashmap : " + map);

		// 키로 데이터 찾기
		System.out.println("key: 1, value: " + map.get(1));
		System.out.println("key: 2, value: " + map.get(2));
		System.out.println("key: 3, value: " + map.get(3));

		// 데이터 수정하기
		map.replace(2, "블루베리"); // 키값이 2인 요소의 값을 블루베리로 변경
		System.out.println("hashmap : " + map);

		// 데이터 삭제하기
		map.remove(1); // 키값이 1인 데이터 삭제
		System.out.println("hashmap : " + map);

		// map 크기 구하기
		int size = map.size();
		System.out.println("map 크기: " + size);

		// 키 목록 조회
		Collection<Integer> keys = map.keySet();
		System.out.println("키 목록: " + keys);

		// 값 목록 조회
		Collection<String> values = map.values();
		System.out.println("값 목록: " + values);

		// 특정키값이 존재하는지 확인하기
		if (map.containsKey(1)) {
			System.out.println("map에 1라는 키가 있습니다");
		} else {
			System.out.println("map에 1라는 키가 없습니다");
		}

	}

}
