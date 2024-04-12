package polymorphism;

/*
 * 메소드에 다형성 활용하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		
		moveAnimal(new Human()); //Animal 클래스의 자식클래스를 매개변수로 사용
		moveAnimal(new Tiger()); //Animal animal = new Tiger() 식이 성립됨
		moveAnimal(new Eagle()); //Animal animal = new Eagle()
	}
	
	public static void moveAnimal(Animal animal) { //자식클래스인 사람,호랑이,독수리를 받을 수 있음
		animal.move(); // 재정의된 메소드가 호출됨
	} 

	//만약 다형성을 활용하지 않는다면 각 클래스를 매개변수로 사용하는 메소드를 만들어야함
//	public static void moveAnimal(Human human) { 
//		human.move();
//	}
//
//	public static void moveAnimal(Tiger tiger) {
//		tiger.move();
//	}
//
//	public static void moveAnimal(Eagle eagle) {
//		eagle.move();
//	}
}
