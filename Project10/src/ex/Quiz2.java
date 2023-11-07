package ex;

import java.util.Scanner;

/*
* DBDriver 인터페이스와 세 클래스를 정의하세요.
* 인터페이스에서 상속받은 메소드를 재정의하세요.
* 1을 입력하면 MySQL, 2를 입력하면 Oracle, 3을 입력하면 Postgres가 연결되도록 프로그램을 구현하세요.
* */
public class Quiz2 {

	public static void main(String[] args) {

		System.out.println("드라이버를 선택하세요.");
		System.out.println("1 : mysql");
		System.out.println("2 : oracle");
		System.out.println("3 : postgres");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); // 숫자 입력받기

		DBDriver dbDriver = null;

		// 입력받은 숫자에 따라 데이터베이스 선택
		if (num == 1) {
			dbDriver = new MySqlBDriver();

		} else if (num == 2) {
			dbDriver = new OracleDBDriver();
			
		} else if (num == 3) {
			dbDriver = new PostgresDBDriver();
			
		} else {
			System.out.println("잘못된 숫자를 입력했습니다.");
		}

		if (dbDriver != null) {
			dbDriver.dbConnect(); // 실제 인스턴스의 메소드 호출
		}

	}

}

// DBDriver 인터페이스
interface DBDriver {

	// 데이터베이스에 연결하는 메소드
	public void dbConnect();

}

class MySqlBDriver implements DBDriver {

	@Override
	public void dbConnect() { // 상속받은 메소드 구현
		System.out.println("MySql DB에 연결합니다.");
	}

}

class OracleDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("Oracle DB에 연결합니다.");
	}

}

class PostgresDBDriver implements DBDriver {

	@Override
	public void dbConnect() {
		System.out.println("Postgres DB에 연결합니다.");
	}

}
