package generic;

/*
 * 여러가지 재료를 사용하는 3D 프린터 클래스 만들기
 * */

//재료로 사용할 파우더 클래스 만들기
class Powder {

	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}

	public String toString() {
		return "재료는 Powder 입니다";
	}

}

//재료로 사용할 플라스틱 클래스 만들기
class Plastic {

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}

	public String toString() {
		return "재료는 Plastic 입니다";
	}

}

//파우더를 재료로 사용하는 프린터 만들기
class ThreeDPrinter1 {

	private Powder material; // 변수의 자료형을 Powder로 선언

	public void setMaterial(Powder powder) {
		this.material = powder;
	}

	public Powder getMaterial() {
		return material;
	}

}

//플라스틱을 재료로 사용하는 프린터 만들기
class ThreeDPrinter2 {

	private Plastic material; // 변수의 자료형을 Plastic으로 선언

	public Plastic getMaterial() {
		return material;
	}

	public void setMaterial(Plastic material) {
		this.material = material;
	}
	
}



