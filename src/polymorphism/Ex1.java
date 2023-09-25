package polymorphism;

/*
 * 다형성 테스트하기
 * */
public class Ex1 {

	public static void main(String[] args) {
		Animal human = new Human(); //Human 인스턴스를 Animal형으로 변환
		Animal tiger = new Tiger(); //Tiger 인스턴스를 Animal형으로 변환
		Animal eagle = new Eagle(); //Eagle 인스턴스를 Animal형으로 변환

		human.move(); // 재정의된 메소드 호출
		tiger.move(); // 실제 인스턴스에 따라 메소드를 호출하는 것이 다형성의 원리
		eagle.move();
	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다. ");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다 ");
	}
}
