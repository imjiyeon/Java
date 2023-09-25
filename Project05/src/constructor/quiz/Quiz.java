package constructor.quiz;

/*
 * 책 객체를 설계한다
 * 클래스 이름: Book
 * 멤버변수: 제목, 가격, 출판사, 페이지수
 * 디폴트 생성자와 모든 멤버변수를 입력받는 생성자를 추가하세요
 * 
 * 그리고 각각 생성자를 사용하여 두개의 인스턴스를 생성하고 모든 값을 초기화하세요
 * */
public class Quiz {

	public static void main(String[] args) {
		Book book1 = new Book(); //디폴트생성자를 사용하여 인스턴스 생성
		book1.bookTitle = "스프링부트"; //인스턴스 생성 후 멤버변수 값을 따로 초기화
		book1.bookPrice = 30000;
		book1.bookCompany = "한빛출판사";
		book1.bookPage = 200;

		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300); //인스턴스 생성과 동시에 모든 멤버변수 초기화
	}
}

class Book {
	
	public String bookTitle;
	public int bookPrice;
	public String bookCompany;
	public int bookPage;
	
	public Book() {
	}

	public Book(String title, int price, String company, int page) {
		bookTitle = title;
		bookPrice = price;
		bookCompany = company;
		bookPage = page;
	}

}
