package method.quiz;

/* 
 * 빼기 메소드를 만들고 호출하세요.
 * 두 수를 입력받아 첫번째 수에서 두번째 수를 뺀 후 그 결과를 반환하세요.
 * 
 * 단, 첫번째 수가 두번째 수보다 작으면 -999을 반환하고 함수를 종료하세요.
 * 예시)10,20 -> -999
 * */
public class Quiz4 {

	//빼기 함수 선언
	public static int substract(int n1, int n2){
		if(n1<n2) {
			return -999;
		}
		int result = n1 - n2;
		return result;
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int result = substract(num1, num2); //함수 호출
		System.out.println(num1 + " - " + num2 + " = " + result + "입니다");

	}

}
