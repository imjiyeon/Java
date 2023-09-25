package loop;

/*
 * for문을 사용해 1부터 20까지 값을 더하다가
 * 합이 100이 넘어가면 반복문을 중단한다
 * for문이 종료되기전 i과 sum의 값을 출력한다
 * */
public class Ex7 {

	public static void main(String[] args) {
		int sum = 0; //합을 저장할 변수를 선언한다
		int i; //for문 밖에서 i의 값을 출력하기 위해 변수를 밖에다 선언한다
		for(i = 1; i<=20; i++) { //i가 1부터 20까지 참이므로 총 20번 반복한다. 그리고 i의 값을 변경하기 위해 1씩 증가시킨다
			sum = sum + i;
			System.out.println("i: " + i + " , sum: " + sum); //중간과정보기
			if(sum >= 100) { //합이 100을 넘으면 for문을 종료한다
				break;
			} 
		}
		System.out.println("i : " + i);
		System.out.println("sum : " +sum); //1~14까지 더하면 합이 100 넘는 것을 알 수 있다
	}

}
