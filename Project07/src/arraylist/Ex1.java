package arraylist;

import java.util.ArrayList;

/*
 * Arraylist 클래스 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		// 리스트 생성
		ArrayList<Integer> list = new ArrayList<Integer>(); // 기초타입의 클래스형인 Integer, Character 같은 Wrapper 클래스를 사용한다
		// 새로운 요소 추가
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		// 2번째 위치에 요소 추가
		list.add(1, 40);
		System.out.println(list);
		// 3번째 요소 삭제
		list.remove(2);
		System.out.println(list);
		// 중간에 있던 요소가 삭제하면 리스트는 연속된 구조이기 때문에 뒤에 있던 요소가 앞으로 한칸 이동한다
	}
}
