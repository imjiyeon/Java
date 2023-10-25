package method.quiz;

/* 
 * 나누기 함수를 만들고 호출하세요.
 * 두 수를 입력받아 첫번째수에서 두번째수를 나눈 몫을 출력하세요.
 * 단, 두번째 수가 0이면 "나누는 수는 0이 될수 없습니다"를 출력하고 함수를 종료하세요.
 * 예시) 10,0 => 나누는 수는 0이 될 수 없습니다
 * */
public class Quiz5 {

	//두 수를 나누는 함수를 선언	 
	public static void divide(int n1, int n2){	
		if(n2 == 0) {	//나누는 수가 0이라면
			System.out.println("나누는 수는 0이 될 수 없습니다");
			return; // 함수를 강제로 종료한다
		} 
		
		int result = n1/n2;
		System.out.println(n1 + "/" + n2 + " = " + result);
	}

	public static void main(String[] args) {
		divide(10, 2);	//함수 호출
//		divide(10, 0);
	}

}
