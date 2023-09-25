package polymorphism;

/*
 * 다형성 테스트하기
 * */
public class Ex3 {

	//Human, Tiger, Eagle는 같은 패키지에 있는 예제에서 사용함
	public static void main(String[] args) {
		
		moveAnimal(new Human()); //Animal 클래스의 자식클래스를 매개변수로 사용
		moveAnimal(new Tiger());
		moveAnimal(new Eagle());
	}
	
	public static void moveAnimal(Animal animal) { //Animal animal = new Tiger()
		animal.move(); // 재정의된 메소드가 호출됨
	} 

	//만약 다형성을 활용하지 않는다면
//	public static void moveAnimal(Human human) { // 각각의 클래스를 매개변수로 사용하는 메소드를 만들어야함
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
