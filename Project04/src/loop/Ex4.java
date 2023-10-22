package loop;

/*
 *  do-while
 * */
public class Ex4 {

	public static void main(String[] args)  {
		int num = 11;

		do { //조건을 만족하지 않더라도 블록을 무조건 한번 실행함
			System.out.println(num);
			num++;
		} while (num<=10); //마지막에 조건식을 검사하고, while문을 빠져나감
	}
}

