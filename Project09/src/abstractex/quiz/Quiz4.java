package abstractex.quiz;

import java.util.ArrayList;

/*
 * Animal타입의 리스트를 생성하세요.
 * 리스트에 사람과 호랑이 객체를 추가하세요.
 * 리스트 안에 저장된 객체를 꺼내서, 객체가 가지고 있는 모든 메소드를 호출하세요. 
 * */
public class Quiz4 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<>(); // 부모타입의 리스트 생성

		list.add(new Human()); // 사람 객체 추가
		list.add(new Tiger()); // 호랑이 객체 추가

		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i); // 리스트 안에 저장된 요소 꺼내기

			animal.sleep(); // 메소드 호출
			animal.move();

			if (animal instanceof Human) { // 실제 인스턴스의 타입 확인
				Human human = (Human) animal; // 다운캐스팅
				human.readBook(); // 사람이 가지고 있는 메소드 호출

			} else if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunting(); // 호랑이가 가지고 있는 메소드 호출
			}

			System.out.println();

		}

	}

}
