package method.quiz;

/* 
 * 나누기 함수를 만들고 호출하기
 * 두 수를 입력받고 첫번째 수에서 두번째수를 나누어 몫을 구한다
 * 그리고 결과를 반환하지 않고 바로 출력한다
 * 
 * 단, 두번째 수가 0이면 "나누는 수는 0이 될수 없습니다"를 출력하고 함수를 종료한다.
 * */
public class Quiz4 {

	//두 수를 나누는 함수를 선언	 
	public static void divide(int n1, int n2){
		int result;
		if(n2 == 0) {	//나누는 수가 0이라면
			System.out.println("나누는 수는 0이 될 수 없습니다");
			return; // 함수를 강제로 종료한다
		} 
		result = n1/n2;
		System.out.println(n1 + " / " + n2 + " = " + result + "입니다");
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		divide(num1, num2);	//함수 호출
	}

}