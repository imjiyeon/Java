package method.quiz;

// 계산기 메소드를 만들고 호출하세요.
//
// 두 수와 연산자(+ - * /) 중에 하나를 입력받아,
// 연산을 수행하고 결과를 출력하세요.
//
// 예시) 1, 5, + => 6
//		6, 2, - => 4
//		2, 5, * => 10
//		10, 2, / => 5

public class Quiz6 {

	//계산기 메소드 선언
	public static void calc(int n1, int n2, char oper){

		int result = 0;

		switch (oper) {
		case '+':
			result = n1 + n2;
			System.out.println(n1+"+"+n2+"="+result);
			break;
		case '-':
			result = n1 - n2;
			System.out.println(n1+"-"+n2+"="+result);
			break;
		case '*':
			result = n1 * n2;
			System.out.println(n1+"*"+n2+"="+result);
			break;
		case '/':
			result = n1 / n2;
			System.out.println(n1+"/"+n2+"="+result);
			break;	
		}
	}
	
	public static void main(String[] args) {
		calc(1,5,'+');
		calc(6,2,'-');
		calc(2,5,'*');
		calc(10,2,'/');
	}

}
