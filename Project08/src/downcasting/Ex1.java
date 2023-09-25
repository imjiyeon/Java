package downcasting;

import java.util.ArrayList;

/*
 * instanceof로 원래 인스턴스형 확인 후 다운캐스팅하기
 **/
public class Ex1 {

	public static void main(String[] args) {
		// 사람,호랑이,독수리를 담을 배열 생성
		ArrayList<Animal> aniList = new ArrayList<Animal>(); // 베열의 자료형은 Animal로 지정
		aniList.add(new Human()); // 리스트에 사람 추가
		aniList.add(new Tiger()); // 리스트에 호랑이 추가
		aniList.add(new Eagle()); // 리스트에 독수리 추가

		for (int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i); // 배열의 요소를 하나씩 Animal형으로 가져옴
			if (ani instanceof Human) { // 실제 인스턴스의 타입이 Human형이면
				Human h = (Human) ani; // Human으로 다운캐스팅
				h.readBook();
			} else if (ani instanceof Tiger) { // 실제 인스턴스의 타입이 Tiger형이면
				Tiger t = (Tiger) ani; // Tiger으로 다운캐스팅
				t.hunting();
			} else if (ani instanceof Eagle) { // 실제 인스턴스의 타입이 Eagle형이면
				Eagle e = (Eagle) ani; // Eagle으로 다운캐스팅
				e.flying();
			}
		}
	}

}

class Animal { // 상위클래스
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal { // Animal을 상속받은 Human클래스
	public void move() { // 메소드 재정의
		System.out.println("사람이 두 발로 걷습니다. ");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}

class Tiger extends Animal { // Animal을 상속받은 Tiger클래스
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

class Eagle extends Animal { // Animal을 상속받은 Eagle클래스
	public void move() {
		System.out.println("독수리가 하늘을 납니다 ");
	}

	public void flying() {
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}
