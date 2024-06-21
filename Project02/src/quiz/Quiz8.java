package quiz;

 
//  <형변환>
//  변수 두개를 선언해서 10과 2.0을 대입하고, 두 변수를 이용해서 사칙연산을 수행하세요.
//  그리고 결과는 정수로 출력해주세요.
  
public class Quiz8 {
	public static void main(String[] args) {
		int i = 10;
		float f = 2.0f;

		System.out.println((int) (i + f));
		System.out.println((int) (i - f));
		System.out.println((int) (i * f));
		System.out.println((int) (i / f));
		
		//풀이
		float result = i + f; // 오른쪽식에서 int와 float를 계산할때, 자동형변환규칙에 의해 int가 float으로 변경
		//결과는 float이 되었고, 그결과를 int형으로 강제 형변환한 것 

	}
}
