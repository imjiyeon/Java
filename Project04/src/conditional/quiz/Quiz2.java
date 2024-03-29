package conditional.quiz;
/*
 * <if문>
 * 정수형 변수 age를 선언하고 나이를 대입하세요.
 * 문자형 변수 gender를 선언하고 성별을 F 또는 M으로 대입하세요.
 * 나이가 8살 이상이고 성별이 여자라면 "여학생입니다" 출력하세요.
 * */
public class Quiz2 {

	public static void main(String[] args) {
		int age = 10;
		char gender = 'F';
		
		if(age>=8 && gender=='F') { //나이가 8살 이상고 성별이 여자라면
			System.out.println("여학생입니다");
		}
	}
}
