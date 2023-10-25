package method.quiz;

/* 
 * 세자리 정수의 각 자리수의 합을 구하는 메소드를 만들고 호출하세요.
 * 예시) 932 => 14 ( = 9 + 3 + 2)
 * */
public class Quiz7 {

	//각 자리수의 합을 구하는 메소드 선언
	public static void hap(int num){
		int sum = 0; //합계		
		//1의 자리
		sum = sum + (num%10);
		//10의자리
		num = num/10;
		sum = sum + (num%10);
		//100의자리
		num = num/10;
		sum = sum + num;

		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		hap(932);
	}

}
