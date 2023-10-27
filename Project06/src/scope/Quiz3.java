package scope;

/* 
 * 모든 변수의 유효범위를 작성하세요
 * */
public class Quiz3 {

	public static void main(String[] args) {
		
		Person person = new Person(); //person은 메인함수가 끝나면 사라진다
		
		int i = 10; //i는 메인함수가 끝나면 사라진다
		
		if(i > 1) {
			String str = "안녕하세요"; //str은 if문 블록이 끝나면 사라진다
		}
		
		for(int k=0; k<10; k++) {
			//k는 for문 블록이 끝나면 사라진다
			System.out.println();
		}
	}
}

