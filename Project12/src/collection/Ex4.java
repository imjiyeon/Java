package collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Set을 사용하여 문자열 여러개를 저장하는 예제를 만든다
 * */
public class Ex4 {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>(); //HashSet 선언 및 생성
		
		hashSet.add("둘리"); //회원 추가
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너"); //중복된 값은 추가 불가
		System.out.println("set 목록: " + hashSet + " 크기: " + hashSet.size()); //추가된 순서와 상관없이 출력됨
		
		hashSet.remove("도우너"); //리스트와 삭제 방법이 다름. 순서가 없는 set은 인덱스가 없으므로 인자로 회원이름을 넣음
		System.out.println("set 목록: " + hashSet + " 크기: " + hashSet.size());
		
		//set은 index 순서가 없기때문에 get메소드로 자료를 꺼낼수없음
		//컬렉션을 순회하는 Iterator클래스를 사용함
		System.out.print("Iterator로 회원 출력: ");
		Iterator<String> ir = hashSet.iterator(); //Iterator클래스 꺼내기
		while(ir.hasNext()) { //다음 요소가 있으면
			String member = ir.next(); //다음요소를 가져옴
			System.out.print(member + " ");
		}
		
		System.out.println();
		System.out.print("람다식 for문으로 회원 출력: ");
		for(String member : hashSet) {
			System.out.print(member + " ");
		}

	}

}
