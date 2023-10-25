package method.quiz;

/* 
 * 두 수를 입력받아, 둘 중에 더 큰 수를 출력하는 함수를 만들고 호출하세요.
 * */
public class Quiz2 {

	//두수를 비교하는 함수 선언
	public static void max(int n1, int n2){
		if ( n1 <= n2) {
			System.out.println(n2);
		} else {
			System.out.println(n1);
		}	
	}
	
	public static void main(String[] args) {
		max(10,5); //함수 호출
	}

}
