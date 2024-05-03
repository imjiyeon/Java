package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * String형 키, int형 value를 가지는 HashMap 객체를 생성하세요.
 * 다음과 같이 데이터 3개를 추가하세요. {"국어", 80},  {"수학", 90}, {"영어", 100}
 * map의 요소를 하나씩 출력하세요.
 * map의 크기를 출력하세요.
 * */
public class Quiz2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		
		//키값으로 map의 요소 조회하기
		System.out.println("key: 국어, value: " + map.get("국어"));
		System.out.println("key: 수학, value: " + map.get("수학"));
		System.out.println("key: 영어, value: " + map.get("영어"));
		
		//map 크기 구하기
		int size = map.size();
		System.out.println("map 크기: " + size);
	}

}
