package method.quiz;

/* 
 * arithmetic 함수를 만들고 호출하기
 * 두 숫자를 입력받고 두 숫자의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지를 출력한다
 * */
public class Quiz1 {

	//arithmetic 함수 선언
	public static void arithmetic(int n1, int n2){
		System.out.println("덧셈 결과 ->" + (n1 + n2));
		System.out.println("뺄셈 결과 ->" + (n1 - n2));
		System.out.println("곱셈 결과 ->" + (n1 * n2));
		System.out.println("나눗셈 몫 ->" + (n1 / n2));
		System.out.println("나눗셈 나머지 ->" + (n1 % n2));
	}

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		arithmetic(num1, num2); //함수 호출
	}

}
