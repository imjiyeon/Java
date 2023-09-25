package generic;

/*
 * 제네릭 클래스 정의하고 사용하기
 * */
public class Ex3 {

	public static void main(String[] args) {
		//객체 생성시, 타입변수 자리에 Powder형 넣기
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>(); //파우더가 재료인 프린터기 생성
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial(); //재료를 반환 받을 때 형변환 생략 가능
		powder.doPrinting();
		
		//객체 생성시, 타입변수 자리에 Plastic형 넣기
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>(); //플라스틱이 재료인 프린터기 생성
		printer2.setMaterial(new Plastic()); 
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
	}

}

//재료는 예제1번의 파우더와 플라스틱을 사용함

//제네릭 클래스 만들기
class ThreeDPrinter<T> { //object클래스 대신 다이아몬드 연산자와 타입변수 사용
	
	private T material; //재료의 자료형을 타입변수로 변경

	public void setMaterial(T material) { //매개변수 변경
		this.material = material;
	}
	
	public T getMaterial() { //리턴타입 변경
		return material;
	}
	
}

