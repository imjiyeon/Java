package method.quiz;

//  두 수를 비교하는 함수 만들고 호출하세요.
//  둘 중에 더 큰 수를 구하고 반환하세요.
//  예시) 10,5 => 10

public class Quiz2 {

	//두수를 비교하는 함수 선언
	public static int max(int n1, int n2){
		if ( n1 > n2) {
			return n1;
		} else {
			return n2;
		}	
		//모든 경우에 return을 해야함
	}
	
	public static void main(String[] args) {
		int result1 = max(10,5); //함수 호출
		int result2 = max(2,7); 
		int result3 = max(5,5); 
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}


//문제풀이
//매개변수는 int형 변수 2개
//리턴값o
//두수를 비교하여 더 큰 값 반환
