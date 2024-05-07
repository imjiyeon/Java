package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


//  String형 키, float형 value를 가지는 HashMap 객체를 생성하세요.
//  다음과 같이 데이터 3개를 추가하세요. {"국어", 80.0},  {"수학", 90.0}, {"영어", 100.0}
//  map을 순회하여 모든 과목의 이름을 출력하세요 -> {국어, 수학, 영어}
//  map을 순회하여 모든 과목의 점수를 출력하세요 -> {80.0, 90.0, 100.0}

public class Quiz3 {

	public static void main(String[] args) {
		
		// map 생성
		HashMap<String, Float> map = new HashMap<>();
		
		// 데이터 추가
		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		// map 순회
		Set<String> set = map.keySet();
		Iterator<String> keys = set.iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println("[과목명]:" + key);
			System.out.println("[점수]:" + map.get(key));
		}
		
		for(String key : set) {
			System.out.println("[과목명]:" + key);
			System.out.println("[점수]:" + map.get(key));
		}
		
	}

}
