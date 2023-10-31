package arraylist;

import java.util.ArrayList;

/*
 * Arraylist 클래스 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		//기초타입의 클래스형인 Integer, Character 같은 Wrapper 클래스를 사용한다
		ArrayList<Integer> list = new ArrayList<Integer>(); //리스트 생성
		list.add(10); //add메소드로 리스트에 요소 추가
		list.add(20);
		list.add(30);
		
		System.out.println("=== 리스트 출력 ===");
		for(int i=0; i<list.size(); i++){ //size()는 리스트의 크기를 반환함
			int num = list.get(i);
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("=== 2번 위치에 데이터 추가 후 리스트 출력 ===");
		list.add(1, 40);
		for(int i=0; i<list.size(); i++){
			int num = list.get(i);
			System.out.print(num + " ");
		}
	
		System.out.println();
		System.out.println("=== 3번째 요소를 삭제한 후 리스트 출력 ===");
		list.remove(2);
		System.out.print(list.get(0) + " ");
		System.out.print(list.get(1) + " ");
		System.out.print(list.get(2) + " ");
		//중간에 있던 요소가 삭제하면 리스트는 연속된 구조이기 때문에 뒤에 있던 요소가 앞으로 한칸 이동한다	 
	}
}
