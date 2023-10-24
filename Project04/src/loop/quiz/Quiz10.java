package loop.quiz;


//*
//**
//***
//****
//*****

/* 중첩 반복문을 사용해서 직각삼각형을 그려보세요
* */
public class Quiz10 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}

//<문제풀이>
//도형의 패턴을 찾아서 반복문과 조건문으로 표현
//첫번째 줄: 별1개
//두번째 줄: 별2개
//높이에따라 별문자를 출력함