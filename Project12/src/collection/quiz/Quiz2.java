package collection.quiz;

import java.util.ArrayList;

/*
 * Character타입의 Arraylist 생성하세요
 * 문자 3개를 추가하세요 ('A','B','C')
 * 리스트에 'A'라는 문자가 있는지 확인하고,
 * 있다면 리스트에서 삭제하세요.
 * */
public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('B');
		list.add('C');
		System.out.println("리스트 요소 삭제 전: " + list);
		for(int i=0; i<list.size(); i++){
			char ch = list.get(i);
			if(ch=='A') {
				list.remove(i);
			}
		}
		System.out.println("리스트 요소 삭제 후: " + list);
	}
}
