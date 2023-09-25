package loop.quiz;

/*
 * for문을 사용해 1부터 100까지 더하는 코드를 작성하시오.
 * 단 중간에, 합이 500이 넘어가면 중단한다.
 * for문이 종료되기전 num과 sum의 값을 출력한다.
*/
public class Quiz4 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
	
		for(i=1; i<=100; i++){ //조건을 만족하는 동안 총 100번 반복한다. 
			sum = sum + i; //i를 1씩 증가시켜서 sum에 계속 더한다
//			System.out.println("i: " + i + " , sum: " + sum); //중간과정보기
			if(sum >= 500) { //반복횟수가 완료되지 않았더라도 sum이 500을 넘으면 for문을 종료하는 조건문을 추가한다
				break;
			} 		
		}
		System.out.println("i: " + i + " , sum: " + sum);
	}

}