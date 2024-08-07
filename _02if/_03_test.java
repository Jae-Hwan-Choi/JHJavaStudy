package _02if;

public class _03_test {

	public static void main(String[] args) {
		// 문제 1번
		double ave = 82.2;
		if (ave > 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 문제 2
		int level = 2;
		int point = 30;
		if (level == 1) {
			point += 30;
		} else {
			point += 10;
		}
		System.out.println(point);
		
		// 문제 3
		int [] lotto = {6,12,33,4,5,26};
		lotto[2] += 80;
		System.out.println(lotto[2]);
		lotto[2] = 33;

		// 문제 4
		if ((lotto[3] % 2) == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		// 문제 5  
		int sum = 0;
		if (lotto[0]%2 == 1) {
			sum+=lotto[0];
		}
		if ((lotto[1]%2)== 1) {
			sum+=lotto[1];
		}
		if ((lotto[2]%2)== 1) {
			sum+=lotto[2];
		}
		if ((lotto[3]%2)== 1) {
			sum+=lotto[3];
		}
		if ((lotto[4]%2)== 1) {
			sum+=lotto[4];
		}
		if ((lotto[5]%2)== 1) {
			sum+=lotto[5];
		}
		System.out.println("합계는 "+sum+"입니다");
		
		// 문제 6 숫자의 모든 합을 구하시오 
		int [] a = {45, 34, 64, 45, 24};
		int sum2 = 0; 
		sum2+=a[0];
		sum2+=a[1];
		sum2+=a[2];
		sum2+=a[3];
		sum2+=a[4];
		System.out.println(sum2);
	
		// 문제 7
		int[] b = {45, 34, 64};
		
	}
}
