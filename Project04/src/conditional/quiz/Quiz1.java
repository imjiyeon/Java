package conditional.quiz;


//  <if문>
//  int형 변수를 선언하고 값을 대입하세요.
//  그리고 조건문을 사용해서 변수의 값이 2의 배수거나 3의 배수라면 "2 또는 3의 배수입니다"를 출력하세요

public class Quiz1 {

	public static void main(String[] args){
		int x = 4;
		if ((x%2 == 0) || (x%3==0)) { //x가 2 또는 3의배수라면
			System.out.println("x는 2 또는 3의 배수입니다: " + x);
		}
	}
}
