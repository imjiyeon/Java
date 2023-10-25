package method.quiz;

/* 
* 합을 구하는 함수 만들고 호출하세요.
* 두 수를 입력받아 n1부터 n2까지의 합을 반환하세요.
* 예시) 5,10 => 5+6+7+8+9+10
*/
public class Quiz3 {
	
	//n1부터 n2까지의 합을 구하는 함수 선언 
	public static int hap(int n1, int n2) {
		int result = 0;	
		for(int i=n1; i<=n2; i++) {
			result = result + i;	
		}
		return result;
	}
	
	public static void main(String[] args) {	
		int num1 = 5; 
		int num2 = 10;
		int sum = hap(num1, num2);	//함수 호출
		
		System.out.println(num1 + "부터 " + num2 + "까지의 합은 " + sum + "입니다.");
	}

}


//문제풀이
//매개변수o, 리턴값o
//두수의 합계를 구하는 반복문 만들기
//for문안에서 return하면 에러남 
//for문도 조건문이라 만족하지 못하면 return 못함