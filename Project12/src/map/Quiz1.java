package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Character형 키, String형 value를 가지는 HashMap 객체 생성하기
 * */
public class Quiz1 {

	public static void main(String[] args) {

		// Character형 키, String형 value를 저장하는 맵 생성
		HashMap<Character, String> map = new HashMap<>(); // 뒤는 타입 생략 가능

		// 데이터 추가
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		System.out.println("hashmap : " + map);

		// 키로 데이터 조회
		String value = map.get('b'); // 키값 b로 값을 조회
		System.out.println("key: b, value: " + value);

		// 데이터 수정
		map.replace('b', "블루베리");
		System.out.println("hashmap : " + map);

		// 데이터 삭제
		map.remove('a');
		System.out.println("hashmap : " + map);

		// map 순회하기
		Iterator<Character> keys = map.keySet().iterator(); // keySet에서 Iterator클래스 꺼내기
		while (keys.hasNext()) { // 다음 key가 있으면
			Character key = keys.next(); // key를 꺼내서
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key)); // 키에 일치하는 값 꺼내기
		}

		// 특정키값이 존재하는지 확인하기
		if (map.containsKey('b')) {
			System.out.println("map에 b라는 키가 있습니다");
		} else {
			System.out.println("map에 b라는 키가 없습니다");
		}

	}

}
