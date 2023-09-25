package reference.quiz;

/*
 * 부서에 부서원을 구성하는 프로그램을 구현하세요.
 * 먼저 Department와 Employee 클래스를 설계하세요.
 * Department의 멤버변수: 부서장, 수석연구원, 책임연구원
 * Employee의 멤버변수: 이름, 나이, 월급, 근속년수
 * 
 * Department 인스턴스를 만들고 부서원을 추가하세요.
 * */
public class Quiz2 {

	public static void main(String[] args) {	
		//직원 3명 생성
		Employee employee1 = new Employee("둘리",50,5000000,20);
		Employee employee2 = new Employee("또치",40,4000000,10);
		Employee employee3 = new Employee("도우너",30,3000000,3);
		//부서생성하고 부서원 추가
		Department department = new Department(employee1, employee2, employee3);
		//부서정보 출력
		System.out.println(department);
	}
}

class Employee{
	String name;
	int age;
	int salary;
	int year;
	
	public Employee(String name, int age, int salary, int year) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", year=" + year + "]";
	}

}

class Department{
	Employee head;
	Employee senior;
	Employee junior;
	
	public Department(Employee head, Employee senior, Employee junior) {
		super();
		this.head = head;
		this.senior = senior;
		this.junior = junior;
	}

	@Override
	public String toString() {
		return "Department [head=" + head + ", senior=" + senior + ", junior=" + junior + "]";
	}

}
