package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


//문자타입 key, 문자열타입 value를 가지는 HashMap을 생성하세요.
//다음과 같이 데이터 3개를 추가하세요.
//{'a', "사과"}, {'b', "바나나"}, {'c', "코코넛"}
//키값이 b인 요소의 값을 조회하세요
//바나나를 블루베리로 변경하세요
//사과를 삭제하세요

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

		// 추가설명
		// 특정키값이 존재하는지 확인하기
		if (map.containsKey('b')) {
			System.out.println("map에 b라는 키가 있습니다");
		} else {
			System.out.println("map에 b라는 키가 없습니다");
		}

	}

}
