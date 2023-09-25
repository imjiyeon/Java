package generic;

import java.util.ArrayList;

/*
 * ArrayList 클래스에서 사용하는 제네릭
 * ArrayList 클래스 내부 구조 보기 (타입변수,get메소드)
 * */
public class Ex4 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>(); //리스트의 자료형을 int로 지정
		list1.add(10);	//int타입의 값만 저장 가능
		Integer i = list1.get(0); //값 꺼낼 때 형변환 생략 가능
		System.out.println(i); 
		
		ArrayList<Boolean> list2 = new ArrayList<>();
		list2.add(true);
		Boolean bool = list2.get(0);
		System.out.println(bool);
	}

}
