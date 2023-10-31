package arraylist.quiz;

import java.util.ArrayList;

/*
 * 문자형(Character) 리스트를 생성하세요.
 * 문자 3개를 추가하세요 ('A','B','C')
 * 리스트의 모든 요소를 출력하세요.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		ArrayList<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('B');
		list.add('C');
		
		char ch1 = list.get(0);
		System.out.print(ch1 + " ");
		char ch2 = list.get(1);
		System.out.print(ch2 + " ");
		char ch3 = list.get(2);
		System.out.print(ch3 + " ");
	}
}
