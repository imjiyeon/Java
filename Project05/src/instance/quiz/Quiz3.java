package instance.quiz;

/* 
 * 다음과 같이 도서 클래스(Book)를 정의하세요.
 * 제목, 가격, 출판사, 페이지수를 멤버변수로 속성으로 갖습니다.
 * 모든 속성의 setter, getter 메소드를 갖습니다.
 *    
 * 그리고 Book 클래스를 사용하여 다음 정보를 가지는 두 개의 인스턴스를 생성하세요.
 * (자바프로그래밍, 20000, 한빛컴퍼니, 300)
 * (스프링, 15000, 한빛컴퍼니, 500)
 * 모든 인스턴스의 정보와 메모리 주소를 출력하세요.
 * */
public class Quiz3 {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("자바프로그래밍");
		book1.setPrice(20000);
		book1.setCompany("한빛컴퍼니");
		book1.setPage(300);
		System.out.println("제목 :" + book1.getTitle());
		System.out.println("가격 :" + book1.getPrice());
		System.out.println("출판사 :" + book1.getCompany());
		System.out.println("페이지수 :" + book1.getPage());
		System.out.println("인스턴스 주소 :" + book1);

		System.out.println();

		Book book2 = new Book();
		book2.setTitle("스프링");
		book2.setPrice(15000);
		book2.setCompany("한빛컴퍼니");
		book2.setPage(500);
		System.out.println("제목 :" + book2.getTitle());
		System.out.println("가격 :" + book2.getPrice());
		System.out.println("출판사 :" + book2.getCompany());
		System.out.println("페이지수 :" + book2.getPage());
		System.out.println("인스턴스 주소 :" + book2);

	}
}

class Book {
	String title; // 제목
	int price; // 가격
	String company; // 출판사
	int page; // 페이지수

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}
}
