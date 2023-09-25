package arraylist.quiz;

import java.util.ArrayList;

/*
 * Character타입의 Arraylist 생성하시오.
 * 문자 3개를 추가하세요 ('A','B','C')
 * 일반for문과 람다식for문을 사용하여 배열의 모든 요소를 출력하세요
 * */
public class Quiz1 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('B');
		list.add('C');
		
		System.out.println("=== 일반 for문 사용 ===");
		for(int i=0; i<list.size(); i++){
			char ch = list.get(i);
			System.out.print(ch + " ");
		}
		System.out.println();
		System.out.println("=== 람다식 for문 사용 ===");
		for(char ch : list){ //(배열에서 꺼낸 값을 저장할 변수 : 배열)
			System.out.print(ch + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("배열요소의 개수: " + list.size());

	}
}
