package method.quiz;

/* 
* 합을 구하는 함수 만들고 호출하기
* 두 수를 입력받고 n1부터 n2까지 더한 합을 반환한다
*/
public class Quiz3 {
	
	//n1~n2까지 합을 구하는 함수 선언 
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
