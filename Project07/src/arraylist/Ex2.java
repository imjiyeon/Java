package arraylist;

import java.util.ArrayList;

/*
 * 반복문을 이용해서 리스트의 요소 출력하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		for (int i = 0; i < list.size(); i++) { // size()는 리스트의 크기를 반환함
			int num = list.get(i);
			System.out.print(num + " ");
		}

	}
}
