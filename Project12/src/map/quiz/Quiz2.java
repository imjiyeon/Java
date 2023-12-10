package map.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * String형 키, int형 value를 가지는 HashMap 객체를 생성하세요.
 * 다음과 같이 데이터 3개를 추가하세요. {"국어", 80},  {"수학", 90}, {"영어", 100}
 * 국어를 50점, 수학을 60점, 영어를 70점으로 수정하세요.
 * 영어점수를 삭제하세요.
 * map에 저장된 모든 요소를 출력하세요.
 * */
public class Quiz2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);
		System.out.println("점수 수정 전: " + map);
				
		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);
		System.out.println("점수 수정 후: " + map);
		
		map.remove("영어");
		System.out.println("영어점수 삭제 후: " + map);
		
	}

}
