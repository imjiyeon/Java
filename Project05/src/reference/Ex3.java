package reference;

/*
 * 기본형 매개변수와 참조형 매개변수의 메모리 구조 비교하기
 * */
public class Ex3 {

	public static void main(String[] args) {		
		int num = 10;
		method1(num); //값 전달
		System.out.println(num); //변수 n의 값을 변경해도 변수 num의 값은 변화가 없다
		
		Subject math = new Subject("수학", 100);
		method2(math); //주소 전달
		System.out.println(math.scorePoint); //sub참조변수로 점수를 변경하면 math참조변수의 점수도 함께 변경된다
	}
	
	public static void method1(int n){ //기본형 매개변수
		n = 5; //값 변경
	}
	
	public static void method2(Subject sub){ //참조형 매개변수
		sub.scorePoint = 50; //점수 변경
	}

}
