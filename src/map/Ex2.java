package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Character형 키, String형 value를 가지는 HashMap 클래스 생성하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		HashMap<Character, String> map = new HashMap<>(); // 뒤에는 생략 가능

		//값 추가하기
		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		System.out.println("hashmap : " + map);

		//값 조회하기
		String value = map.get('b'); // 키값 b로 값을 조회
		System.out.println("key: b, value: " + value);

		//값 수정하기
		map.replace('b', "블루베리");
		System.out.println("hashmap : " + map);

		//값 삭제하기
		map.remove('a');
		System.out.println("hashmap : " + map);

		//키값을 모를때, 모든 요소 순회하기
		Iterator<Character> keys = map.keySet().iterator(); //keySet에서 Iterator클래스 꺼내기
		while (keys.hasNext()) { // 다음 key가 있으면
			Character key = keys.next(); // key값을 가져와서
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key)); // 값 꺼내기
		}
		
		//특정키값이 존재하는지 확인하기
		if(map.containsKey('b')) {
			System.out.println("map에 b키값이 있습니다");
		}else {
			System.out.println("map에 b키값이 없습니다");
		}

	}

}
