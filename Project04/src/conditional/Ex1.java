package conditional;

//Test

/*
 * <if문>
 * 만약 나이가 8살 이상이면 '학교에다닙니다' 출력하기
 * */
public class Ex1 {

	public static void main(String[] args) {

		int age = 10;
		if ( age >= 8 ){ //나이가 8살 이상이면
			System.out.println("학교에 다닙니다");
		}
		
		//블록의 의미
		if ( age >= 8 ){
			int temp = 0; //temp는 블록이 끝나기 전까지만 존재함
		}
		//System.out.println(temp); //변수가 소멸되어 에러남

	}
}
