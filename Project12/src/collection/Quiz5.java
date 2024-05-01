package collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Integer 타입의 HashSet 생성하세요
 * set에 숫자 3개를 추가하세요
 * set의 크기를 출력하세요
 * Iterator를 이용하여 set의 요소를 하나씩 출력하세요
 * */
public class Quiz5 {

	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		
		System.out.println(hashSet); //추가한 순서대로 저장되지 않는다
		System.out.println("Set의 크기: " + hashSet.size());
		
		//Iterator를 사용해서 set을 순회
		Iterator<Integer> ir = hashSet.iterator();
		while(ir.hasNext()) {
			int i = ir.next();
			System.out.println(i);
		}
		
		//포문을 사용해서 set을 순회
		for(int i : hashSet) {
			System.out.println(i);
		}
		
	}
}
