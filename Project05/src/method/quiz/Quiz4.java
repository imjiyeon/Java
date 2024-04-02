package method.quiz;

//  빼기 메소드를 만들고 호출하세요.
//  두 수를 입력받아 첫번째 수에서 두번째 수를 뺀 후 그 결과를 반환하세요.
//  단, 첫번째 수가 두번째 수보다 작으면 -999을 반환하고 함수를 종료하세요.
//  예시) 20, 10 => 10
//		5, 1 => 4
//		10, 20 => -999

public class Quiz4 {

	// 두 수의 차를 구하는 메소드 선언
	public static int substract(int n1, int n2){
		// 만약 첫번째 수가 더 작다면, -999를 반환하고 종료
		// 계산할 필요가 없으니까 식의 앞쪽에 배치
		if(n1<n2) {
			return -999;
		}
		
		int result = n1 - n2; // 두 수의 차
		return result; // 결과값 반환
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;

		int result = substract(num1, num2); //함수 호출
		System.out.println(num1 + " - " + num2 + " = " + result + "입니다");
	}

}
