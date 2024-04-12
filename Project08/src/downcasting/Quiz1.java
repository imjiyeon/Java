package downcasting;

import java.util.ArrayList;

//리스트를 하나 생성하세요
//리스트에 사람, 호랑이, 독수리를 하나씩 추가하세요
//
//반복문으로 리스트에 저장된 요소를 하나씩 꺼내서
//사람이라면 readBook() 메소드 호출하세요
//호랑이이라면 hunting() 메소드 호출
//독수리라면 flying() 메소드 호출

public class Quiz1 {

	public static void main(String[] args) {
		// 사람,호랑이,독수리를 담을 배열 생성
		ArrayList<Animal> aniList = new ArrayList<Animal>(); // 베열의 자료형은 Animal로 지정
		aniList.add(new Human()); // 리스트에 사람 추가
		aniList.add(new Tiger()); // 리스트에 호랑이 추가
		aniList.add(new Eagle()); // 리스트에 독수리 추가

		for (int i = 0; i < aniList.size(); i++) {

			Animal ani = aniList.get(i); // 배열의 요소를 꺼내서 Animal형 변수에 저장

			if (ani instanceof Human) { // 인스턴스의 타입이 Human형이면
				Human h = (Human) ani; // Human형으로 다운캐스팅
				h.readBook();
			} else if (ani instanceof Tiger) { // 인스턴스의 타입이 Tiger형이면
				Tiger t = (Tiger) ani; // Tiger형으로 다운캐스팅
				t.hunting();
			} else if (ani instanceof Eagle) { // 인스턴스의 타입이 Eagle형이면
				Eagle e = (Eagle) ani; // Eagle형으로 다운캐스팅
				e.flying();
			}
		}
	}

}
