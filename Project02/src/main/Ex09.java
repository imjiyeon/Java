package main;

/*
 * 자동형변환
 * */
public class Ex09 {

	public static void main(String[] args) {	
		//정수형
		byte b = 10;
		int i = b; //b변수의 값을 i변수에 복사한다. int형의 크기는 4바이트 이므로 값손실없이 저장된다.
		System.out.println(i);
		
		//실수형
		float f = 10.0f;		
		double d = f;  //f변수의 값을 d변수에 복사한다.
		System.out.println(d); //10.0
		
		//정수형과 실수형
		int iNum = 1;
		float fNum = iNum; //더정밀한 쪽으로 변환될때는 자동으로 형변환된다. 실수형은 소수점 밑 수를 표현하기 때문에 정수형보다 더 정밀하다
		System.out.println(fNum); //1.0
		
		//연산중에 자동변환 되는 경우
		System.out.println(iNum + fNum); //컴퓨터가 더하기 연산을 수행할 때, 두 항을 같은 자료형으로 변환한다. 이 때 iNum이 float형으로 자동형변환된다  
	}
}
