package wrapper.quiz;

import java.util.ArrayList;

/*
 * 리스트를 생성하고 a,b,c,d 문자를 저장하세요
 * 그리고 리스트안에 저장된 모든 문자를 꺼내서 출력하세요
 * */
public class Quiz4 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>(); //char의 wrapper클래스 사용
		list.add('a');
		list.add('b');
		list.add('c');
		list.add('d');
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		for(int i=0;i<list.size();i++) {
			char ch = list.get(i); //Character값.intValue()로 변환 (언박싱)
			System.out.println(ch);
		}
		
	}
}
