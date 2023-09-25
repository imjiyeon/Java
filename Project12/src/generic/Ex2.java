package generic;

/*
 * 모든 재료를 쓸 수 있는 3D 프린터기 구현하기
 * */
public class Ex2 {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder(); //Powder를 재료로 선택
		printer.setMaterial(p1); //매개변수가 자동 형 변환됨
		
		Powder p2 = (Powder)printer.getMaterial(); //재료를 반환 받을 때는 직접 형변환 해야함
		p2.doPrinting();
	}

}

//재료는 예제1번의 파우더와 플라스틱을 사용함

//파우더와 플라스틸을 재료로 모형을 출력하는 프린터 정의하기
class ThreeDPrinter3 {
	
	private Object material; //재료의 자료형을 Object로 선언. 모든 재료를 쓸 수 있음

	public void setMaterial(Object material) { //Object형 매개변수
		this.material = material;
	}
	
	public Object getMaterial() { //Object형 리턴타입
		return material;
	}
}
