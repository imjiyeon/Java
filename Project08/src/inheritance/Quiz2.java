package inheritance;


//  베이직티비(BasicTV)을 정의하는 클래스를 만드세요.
//  속성: 전원상태, 채널, 볼륨
//
//  베이직티비 클래스를 상속받는 스마트티비(SmartTV) 클래스를 만드세요.
//  속성: 아이피
//
//  베이직티비 인스턴스를 생성하세요. (전원 상태:on, 채널:7, 볼륨:20)
//  스마트티비 인스턴스를 생성하세요. (전원 상태:on, 채널:11, 볼륨:30, 아이피:192.168.0.111)
//  모든 인스턴스의 정보를 출력하세요

public class Quiz2 {

	public static void main(String[] args) {
		BasicTV tv1 = new BasicTV();
		tv1.isPowerOn = true;
		tv1.channel = 7;
		tv1.volume = 20;
		tv1.showInfo();

		System.out.println();
        
		SmartTV tv2 = new SmartTV();
		tv2.isPowerOn = true;
		tv2.channel = 30;
		tv2.volume = 12;
		tv2.ip = "192.168.0.111";
		tv2.showInfo();
	}

}
// 베이직티비 클래스
class BasicTV {
	boolean isPowerOn; //전원상태
	int channel; //채널
	int volume; //볼륨

	public void showInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
	}
}
// 스마트티비 클래스
class SmartTV extends BasicTV {
	String ip; //스마트티비에 필요한 속성 추가

	public void showInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + isPowerOn);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("IP 주소 : " + ip);
	}
}
