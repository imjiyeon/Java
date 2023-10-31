package scope;

/* 
 * 모든 변수의 유효범위를 작성하세요 (블록스코프)
 * */
public class Quiz3 {

	public static void main(String[] args) {
		
		Person person = new Person(); //person는 메인함수가 끝나기 전까지 사용 가능
		
		int i = 10; //i는 메인함수가 끝나기 전까지 사용 가능
		
		if(i > 1) {
			String str = "안녕하세요"; //str은 if문 블록이 끝나기 전까지 사용 가능
		}
		
		for(int k=0; k<10; k++) { //k는 for문 블록이 끝나기 전까지 사용 가능
			System.out.println();
		}
		
		//지역변수의 유효 범위는 변수가 선언된 블록 스코프에 따라 달라진다
	}
}

