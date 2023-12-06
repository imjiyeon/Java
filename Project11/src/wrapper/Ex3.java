package wrapper;

import java.util.ArrayList;

/*
 * 래퍼 클래스를 사용한 리스트 생성하기
 * */
public class Ex3 {
	
	public static void main(String[] args) {

		// 리스트는 기초타입을 사용할 수 없기 때문에 'Boolean'과 같은 래퍼클래스를 사용해야함
		ArrayList<Boolean> list = new ArrayList<Boolean>(); 
		
		// 오토박싱을 통해 boolean 값을 ArrayList에 추가
		list.add(true); //new Boolean(true)로 변환됨. (오토박싱)
		list.add(true);
		list.add(false);
		
		boolean b = list.get(0); // list.get(0).booleanValue()으로 변환됨. (언박싱)
		
	}
	
}
