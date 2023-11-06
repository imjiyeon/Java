package ex;

/*
 * 인터페이스와 형변환
 * */
public class Ex2 {

	public static void main(String[] args) {
		
		Calc calc = new Calculator(); // 부모타입으로 변수를 형변환시킴
		
		System.out.println(calc.add(2, 3));
		//calc.showInfo(); // 에러남. 자식클래스에서 추가한 기능은 사용할 수 없음
	}

}
