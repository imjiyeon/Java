package map.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * String형 키, int형 value를 가지는 HashMap 클래스를 생성한다
 * 데이터 3개를 추가한다. {"국어", 80},  {"수학", 90}, {"영어", 100}
 * 국어를 50점, 수학을 60점, 영어를 70점으로 수정한다.
 * 요소를 하나씩 출력한다
 * 영어점수를 삭제한다
 * */
public class Quiz2 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		System.out.println("hashmap 수정 전: " + map);
		
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		
		int value1 = map.get("국어");
		System.out.println("key: 국어, value: " + value1);
		int value2 = map.get("수학");
		System.out.println("key: 수학, value: " + value2);
		int value3 = map.get("영어");
		System.out.println("key: 영어, value: " + value3);
		
		map.remove("영어");
		System.out.println("hashmap 영어 삭제 후: " + map);
		
	}

}
