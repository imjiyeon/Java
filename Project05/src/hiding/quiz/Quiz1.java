package hiding.quiz;

//  책(Book)을 정의하는 클래스를 만드세요.
//  속성: 제목, 가격, 출판사, 페이지수
//  기능: 각 멤버변수의 getter와 setter
//
//  Book 클래스를 사용하여 다음 정보를 가지는 두 개의 인스턴스를 생성하세요.
//  이때, 책의정보는 setter를 사용해서 변경하세요.
//  (자바프로그래밍, 20000, 한빛컴퍼니, 300)
//  (스프링, 15000, 한빛컴퍼니, 500)
//  모든 인스턴스의 정보를 출력하세요.
//  이때, 책의 정보는 getter를 사용해서 출력하세요.

public class Quiz1 {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("자바프로그래밍");
		book1.setPrice(20000);
		book1.setCompany("한빛컴퍼니");
		book1.setPage(300);
		System.out.println("제목:"+book1.getTitle());
		System.out.println("가격:"+book1.getPrice());
		System.out.println("출판사:"+book1.getCompany());
		System.out.println("페이지수:"+book1.getPage());
		
		Book book2 = new Book();
		book2.setTitle("스프링");
		book2.setPrice(15000);
		book2.setCompany("한빛컴퍼니");
		book2.setPage(500);
		System.out.println("제목:"+book2.getTitle());
		System.out.println("가격:"+book2.getPrice());
		System.out.println("출판사:"+book2.getCompany());
		System.out.println("페이지수:"+book2.getPage());
	}
}

class Book {
	private String title; //제목
	private int price; //가격
	private String company; //출판사
	private int page; //페이지수
	
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