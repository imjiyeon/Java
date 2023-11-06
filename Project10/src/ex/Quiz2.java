package ex;

import java.util.Scanner;

/*
* DBDriver 인터페이스를 상속받아서 MariaDriver를 만들고
* 4번을 입력하면 Maria DB에 연결하도록 변경하세요
* */
public class Quiz2 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.out.println("드라이버를 선택하세요.");
		System.out.println("1 : mysql");
		System.out.println("2 : oracle");
		System.out.println("3 : postgres");
		//키보드로 숫자 입력받기
		Scanner scanner = new Scanner(System.in);
		int num =  scanner.nextInt();

		DBDriver dbDriver = null;
		//입력받은 숫자로 어떤 데이터베이스를 실행할지 결정한다
		if(num==1) {
			dbDriver = new MySqlBDriver();
		}else if(num==2) {
			dbDriver = new OracleDBDriver();
		}else if(num==3) {
			dbDriver = new PostgresDBDriver();
		}else {
			System.out.println("잘못된 숫자를 입력했습니다.");
		}
		
		if(num<=3) {
			dbDriver.dbConnect(); //실제 인스턴스의 메소드를 호출한다
		}
		//새로운 데이터베이스가 추가되어도 사용법은 같다
		
	}

}


/*
 * DBDriver 인터페이스 만들기
 * */
interface DBDriver {

	/* abstract 예약어가 붙지 않아도 추상메소드 */
	public void dbConnect(); // 데이터베이스에 연결한다
	
}

class MySqlBDriver implements DBDriver{

	@Override
	public void dbConnect() { // 메소드 구현
		System.out.println("MySql DB에 연결합니다.");
	}
	
}

class OracleDBDriver implements DBDriver{

	@Override
	public void dbConnect() { // 메소드 구현
		System.out.println("Oracle DB에 연결합니다.");
	}
	
}

class PostgresDBDriver implements DBDriver{

	@Override
	public void dbConnect() { // 메소드 구현
		System.out.println("Postgres DB에 연결합니다.");
	}
	
}

