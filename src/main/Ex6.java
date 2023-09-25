 package main;

 /*
  * 논리연산자
  * */
public class Ex6 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		boolean flag1 = (x > 0) && (y > 0); // true && true 
		boolean flag2 = (x < 0) && (y > 0); // false &&     , 논리 곱은 첫번째 식이 거짓이면 바로 종료한다. 두번째 식을 수행하지 않는다. 
		boolean flag3 = (x > 0) || (y > 0); // true||true
		boolean flag4 = (x > 0) || (y < 0); // true||false
		boolean flag5 = !(x > 0); //!(true)
		
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		System.out.println(flag4);
		System.out.println(flag5);
	}
}
