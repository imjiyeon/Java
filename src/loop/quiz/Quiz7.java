package loop.quiz;


//*****
//*****
//*****

/* 중첩반복문을 사용해서 직사각형을 그려보세요 
* */
public class Quiz7 {

	public static void main(String[] args) {		
		for(int i = 1; i <=3; i++){
			for(int j = 1; j <=5; j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}

