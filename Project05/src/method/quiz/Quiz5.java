package method.quiz;

//  나누기 함수를 만들고 호출하세요.
//  두 수를 입력받아 첫번째수에서 두번째수를 나눈 몫을 출력하세요.
//  단, 두번째 수가 0이면 "나누는 수는 0이 될수 없습니다"를 출력하고 함수를 종료하세요.
//  예시) 10, 2 => 5
//	 	 15, 5 => 3
//		 10, 0 => 나누는 수는 0이 될 수 없습니다

public class Quiz5 {

	//두 수를 나누는 메소드를 선언
	public static void divide(int n1, int n2){	
		// 2.조건문 추가
		// 조건문이 계산식 뒤에 있으면, 0으로 나누는 계산을 하고 에러남
		if(n2 == 0) {	//나누는 수가 0이라면 함수를 강제로 종료
			System.out.println("나누는 수는 0이 될 수 없습니다");
			return;
			//return은 값을 반환하는 것뿐만이아니라 함수를 종료하는 기능이 있음
		} 
		
		// 1.계산식 먼저 작성
		int result = n1/n2;
		System.out.println(n1 + "/" + n2 + " = " + result);
	}

	public static void main(String[] args) {
		divide(10, 2);	//함수 호출
//		divide(10, 0);
	}

}
