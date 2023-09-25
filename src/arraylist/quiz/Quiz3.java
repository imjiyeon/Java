package arraylist.quiz;

import java.util.ArrayList;

/*
 * String타입의 Arraylist 생성하세요
 * 문자열 5개를 추가하세요 ("AA","BB","CC","DD","EE")
 * 일반for문과 람다식for문을 사용하여 배열의 모든 요소를 출력하세요
 * 
 * 그리고 리스트에서 모든 문자를 삭제하세요
 * */
public class Quiz3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		
		System.out.println("=== 일반 for문 사용 ===");
		for(int i=0; i<list.size(); i++){
			String str = list.get(i);
			System.out.print(str + " ");
		}
		System.out.println();
		System.out.println("=== 람다식 for문 사용 ===");
		for(String str : list){ //(배열에서 꺼낸 값을 저장할 변수 : 배열)
			System.out.print(str + " ");
		}
		
		list.remove(0); //중간에 있던 요소가 삭제하면 배열은 연속된 구조이기 때문에 뒤에 있던 요소가 앞으로 한칸 이동한다
		list.remove(0);
		list.remove(0);
		list.remove(0);
		list.remove(0);
		System.out.println();
		System.out.println();
		System.out.println("배열요소의 개수: " + list.size());

	}
}
