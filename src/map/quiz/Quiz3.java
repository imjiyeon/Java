package map.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * String형 키, int형 value를 가지는 HashMap 클래스를 생성한다
 * 데이터 3개를 추가한다. {"국어", 80},  {"수학", 90}, {"영어", 100}
 * Iterator를 사용하여 모든 과목의 이름을 출력한다.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		System.out.println("hashmap : " + map);
		
		Iterator<String> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println("[과목]:" + key);
		}
		
	}

}
