package main;

/*
 * 문자형 연습
 * */
public class Ex05 {

	public static void main(String[] args) {
		
		//char형에는 한글자 문자를 저장 할 수 있다
		char ch1 = 'A';	//문자는 작은따음표로 감싸야 한다	
		System.out.println(ch1); //A
		//char형 변수에 저장된 문자를 int형으로 변환하면 그 문자에 해당되는 값을 알 수 있다
		System.out.println((int)ch1); //65
		
		char ch2 = 66; //char형 변수에는 숫자도 저장할 수 있다
		System.out.println(ch2); //원래 자료형인 문자가 출력된다
		
		char ch3 = '\n'; //한줄띄기를 의미하는 특수문자
		char ch4 = '\t'; //탭을 의미하는 특수문자
		
		System.out.print(ch3);
		System.out.print("안녕하세요");
		System.out.print(ch4);
		System.out.print("저는둘리입니다");
		
		//String형에는 문자열을 저장 할 수 있다
		String str = "안녕하세요"; //문자열은 큰따음표로 감싸야 한다
		System.out.println();
		System.out.println(str);
	}
}
