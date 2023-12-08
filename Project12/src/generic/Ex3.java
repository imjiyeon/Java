package generic;

/*
 * 제네릭 클래스 만들기
 * */
public class Ex3 {

	public static void main(String[] args) {
		
		//파우더를 사용하는 프린터기 생성
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>(); //객체를 생성할 때 타입을 파우더로 지정 
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial(); //재료를 꺼낼 때 Powder가 반환됨
		powder.doPrinting();
		
		//플라스틱을 사용하는 프린터기 생성	
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>(); //객체를 생성할 때 타입을 플라스틱으로 지정
		printer2.setMaterial(new Plastic()); 
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
	}

}

//재료는 예제1번의 파우더와 플라스틱을 사용함

//제네릭 클래스 만들기
class ThreeDPrinter<T> { //다이아몬드 연산자안에 문자T 작성
	
	private T material; //Object대신 문자T 작성

	public void setMaterial(T material) { //매개변수 변경
		this.material = material;
	}
	
	public T getMaterial() { //리턴타입 변경
		return material;
	}
	
}

