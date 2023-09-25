package inheritance.quiz;

/*
 * 동물, 호랑이, 독수리 세클래스를 만들고 상속관계를 구현하세요
 * 동물 클래스는 다리 속성을 가지고 있다
 * 호랑이 클래스는 꼬리를 가지고 있다
 * 독수리 클래스는 날개를 가지고 있다
 * 그리고 호랑이와 독수리 클래스는 동물 클래스를 상속받는다
 * 
 * 호랑이 인스턴스를 생성하고 다리4개와 꼬리1개를 저장하세요
 * 독수리 인스턴스를 생성하고 다리2개와 날개2개를 저장하세요
 * */
public class Quiz1 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.leg = 4; //부모클래스에서 물려받은 속성
		tiger.tail = 1;
		
		Eagle eagle = new Eagle();
		eagle.leg = 2; //부모클래스에서 물려받은 속성
		eagle.wing = 2;
	}

}

class Animal {
	int leg;
}

class Tiger extends Animal {
	int tail;
}

class Eagle extends Animal {
	int wing;
}

