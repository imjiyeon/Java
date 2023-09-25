package arraylist;

import java.util.ArrayList; //프로그램에서 사용할 외부클래스를 선언한다. ArrayList는 util 패키지 밑에 있다.

/*
 * Arraylist 사용하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		//int, char와 같은 기초타입은 Integer, Character 같은 Wrapper 클래스를 한다 (기초타입의클래스형)
		ArrayList<Integer> list = new ArrayList<Integer>(); //리스트 선언과 생성. 크기 지정x
		list.add(10); //add메소드로 리스트에 요소 추가
		list.add(20);
		list.add(30);
		
		System.out.println("=== 리스트 출력 ===");
		for(int i=0; i<list.size(); i++){ //리스트에 추가된 개수 만큼 출력
			int num = list.get(i);
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("=== 2번위치에 데이터 추가 후 리스트 출력 ===");
		list.add(1, 40);
		for(int i=0; i<list.size(); i++){
			int num = list.get(i);
			System.out.print(num + " ");
		}
	
		System.out.println();
		System.out.println("=== 3번위치의 배열 요소 삭제 후 리스트 출력 ===");
		list.remove(2); //remove메소드로 3번째 요소 삭제
		System.out.print(list.get(0) + " ");
		System.out.print(list.get(1) + " ");
		System.out.print(list.get(2) + " ");
		//중간에 있던 요소가 삭제하면 리스트는 연속된 구조이기 때문에 뒤에 있던 요소가 앞으로 한칸 이동한다	 
	}
}
