package ex;

import java.util.Scanner;

/*
 * 고객 상담 전화 배분 프로그램 구현하기
 * */
public class Ex5 {
	public static void main(String[] args) {

		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("1 : 한명씩 차례로 할당 ");
		System.out.println("2 : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("3 : 우선순위가 높은 고객 먼저 할당 ");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(); // 문자를 입력받아서 num변수에 저장

		Scheduler scheduler = null;

		// 입력받은 숫자에 따라서 정책을 선택함
		if (num == 1) { // 입력받은 값이 1이면 RoundRobin 클래스 생성
			scheduler = new RoundRobin();
			
		} else if (num == 2) { // 입력받은 값이 2이면 LeastJob 클래스 생성
			scheduler = new LeastJob();
			
		} else if (num == 3) { // 입력받은 값이 3이면 PriorityAllocation 클래스 생성
			scheduler = new PriorityAllocation();
			
		} else {
			System.out.println("지원되지 않는 기능입니다.");
		}

		if (scheduler != null) {
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}

	}
}

//상담원 한명씩 돌아가며 동일하게 상담 업무 배분
class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 전달합니다.");

	}

}

//현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 배분
class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대기가 가장 적은 상담원에게 전달합니다.");

	}

}

//등급이 높은 고객의 전화부터 대가열에서 가져와 업무 능력이 높은 상담원 우선 배분
class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("등급이 높은 고객의 전화를 먼저 가져옵니다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무스킬이 높은 상담원에게 우선적으로 전달합니다.");

	}
}
