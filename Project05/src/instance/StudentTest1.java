package instance;

/* 
 * 실행클래스 만들기
 * 학생클래스 생성하고 사용하기
 * */
public class StudentTest1 {

	public static void main(String[] args) {

		Student student = new Student(); //Student 클래스 생성
		
		student.studentID = 1111; //학생의 멤버변수 사용해서 정보를 저장
		student.setStudentName("홍길동");
		student.grade = 2 ;
		student.address = "인천 연수구";
		
		System.out.println("학생의 모든 정보를 출력합니다.");
		System.out.println("studentID = " + student.studentID);	
		System.out.println("studentName = " + student.getStudentName());		
		System.out.println("grade = " + student.grade);		
		System.out.println("address = " + student.address);	
		
		System.out.println("=================================");
		student.showStudentInfo(); //학생의 메소드를 사용하여 학생의 모든 정보 출력
		System.out.println("=================================");	
		System.out.println("객체의 주소는 " + student + " 입니다."); //참조 변수 값 출력 (인스턴스 주소)
		
	}
}

