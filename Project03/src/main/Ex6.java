 package main;

 /*
  * 논리연산자와 논리부정연산자
  * */
public class Ex6 {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		boolean result1 = (x > 0) && (y > 0); // true && true 
		boolean result2 = (x > 0) && (y < 0); // true && false   
		boolean result3 = (x > 0) || (y > 0); // true||true
		boolean result4 = (x > 0) || (y < 0); // true||false
		boolean result5 = !(x > 0); //!(true)
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}
}
