package main;

/*
 * 증감연산자
 * */
public class Ex2 {

	public static void main(String[] args) {
	
	      //증감연산자가 변수의 뒤에 있을때
		  int x = 100;     
		  int y = x++;
		  int z = x--; 
		  
		  System.out.println(x);  // 100
		  System.out.println(y);  // 100
		  System.out.println(z);  // 101
		  
	      //증감연산자가 변수의 앞에 있을때
//		  int x = 100; // 변수x를 선언하고 값 100 저장      
//		  int y = ++x;  // x의 값을 1 증가하고 y에 대입
//		  int z = --x;   // x의 값을 1 감소하고 z에 대입
//		  
//		  System.out.println(x);  //100
//		  System.out.println(y);  //101 
//		  System.out.println(z);  //100

	}
}
