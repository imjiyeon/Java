package downcasting;

/*
 * 형변환된 변수를 다운캐스팅하기
 **/
public class Ex1 {

	public static void main(String[] args) {

		Animal animal = new Human(); // animal변수를 형변환 시킴

		if (animal instanceof Human) { // 실제 인스턴스의 타입이 Human형인지 확인
			Human human = (Human) animal; // Human형 변수로 다운캐스팅
			human.readBook(); // 객체가 가지고 있는 readBook기능을 사용할 수 있음
		}

		// 잘못된 경우
		// Tiger tiger = (Tiger) animal; //컴파일 오류가 안남.
	}

}

//동물 클래스
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//사람 클래스
class Human extends Animal { // 동물클래스 상속받기
	public void move() { // 메소드 재정의
		System.out.println("사람이 두 발로 걷습니다. ");
	}

	public void readBook() {
		System.out.println("사람이 책을 읽습니다. ");
	}
}

//호랑이 클래스
class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다. ");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다. ");
	}
}

//독수리 클래스
class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다 ");
	}

	public void flying() {
		System.out.print("독수리가 날개를 쭉 펴고 멀리 날아갑니다");
	}
}
