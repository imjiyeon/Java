package wrapper.quiz;

import java.util.ArrayList;

/* <래퍼 클래스를 사용한 리스트 생성하기>
 * 
 * 문자를 저장하는 리스트를 생성하고 'a','b','c','d' 를 저장하세요.
 * 그리고 리스트 안에 저장된 모든 문자를 꺼내서 출력하세요.
 * */
public class Quiz4 {

	public static void main(String[] args) {

		//문자를 저장하는 리스트 생성
		ArrayList<Character> list = new ArrayList<>(); 
		
		//리스트에 문자 추가
		list.add('a'); //list.add(new Character('a'))으로 변환됨. (오토박싱)
		list.add('b');
		list.add('c');
		list.add('d');

		//리스트 안에 저장된 문자를 모두 출력
		for(int i=0;i<list.size();i++) {
			char ch = list.get(i); //list.get(i).charValue()으로 변환됨. (언박싱)
			System.out.println(ch);
		}
		
	}
}
