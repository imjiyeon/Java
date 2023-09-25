package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * int형 키, String형 value를 가지는 HashMap 클래스 생성하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//값 추가하기
		map.put(1, "사과"); //key, value 쌍으로 값 추가
		map.put(2, "바나나");
		map.put(3, "코코넛");
		System.out.println("hashmap : " + map);

		//키값으로 map의 요소 조회하기
		System.out.println("key: 1, value: " + map.get(1));
		System.out.println("key: 2, value: " + map.get(2));
		System.out.println("key: 3, value: " + map.get(3));

		//값 수정하기
		map.replace(2, "블루베리"); //키값이 2인 요소의 값을 블루베리로 교체
		System.out.println("hashmap : " + map);

		//값 삭제하기
		map.remove(1); //키값이 1인 요소 삭제
		System.out.println("hashmap : " + map);

		//키값을 모를때, 모든 요소 순회하기
		Iterator<Integer> keys = map.keySet().iterator(); //keySet에서 Iterator클래스 꺼내기
		while (keys.hasNext()) { //다음 key가 있으면
			int key = keys.next(); //key값을 가져오기
			System.out.println("[Key]:" + key + " [Value]:" + map.get(key)); //값 꺼내기
		}
		
		//map 크기 구하기
		int size = map.size();
		System.out.println("map 크기: " + size);
		
		//값 목록 구하기
		Collection<String> values = map.values();
		System.out.println("values: " + values);

	}

}
