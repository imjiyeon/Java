package quiz;

/*
 * <함수>
 * getSum 함수는 배열에 저장된 모든 숫자의 합을 계산하여 반환합니다
 * 메인 함수에서는 배열을 생성하고, getSum 함수를 호출하여 합계를 계산합니다
 * 마지막으로 결과를 출력합니다
 * */
public class Quiz4 {

	public static void main(String[] args) {
		int arr[] = {1,3,5,7,9};
		int result = getSum(arr);
		System.out.println("배열의 합은 " + result + " 입니다");
	}

	public static int getSum(int[] arr) {
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
