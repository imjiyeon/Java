package wrapper;

import java.util.ArrayList;

/*
 * 리스트에 boolean값 담기
 * */
public class Ex3 {
	
	public static void main(String[] args) {
		
		//list는 객체형 자료형만 사용 가능하므로 boolean의 wrapper클래스 사용해야함
		ArrayList<Boolean> list = new ArrayList<Boolean>(); 
		
		list.add(true); //list.add(new Boolean(true))로 변환 (오토박싱)
		list.add(true);
		list.add(false);
	}
	
}
