package quiz;

/*
 * <변수>
 * 변수 x을 선언하고 25를 대입한다.
 * 변수 y를 선언하고 40을 대입한다.
 * 두 변수의 값을 서로 바꾼다.
 * */
public class Quiz1 {

	public static void main(String[] args) {
		int x = 25;
		int y = 40;
		int temp; //temp는 두 수를 바꿀 때 사용할 임시 변수이다
		
		temp = x; //temp에 x의 값을 저장한다
		x = y; //x에 y의 값을 저장한다
		y = temp; //y에 temp의 값을 저장한다
		
		System.out.println("x: " + x + ", y: " + y); //x와 y를 출력한다
	}

}
