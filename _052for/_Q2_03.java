package _052for;

public class _Q2_03 {

	public static void main(String[] args) {
		// 1-10까지 팩토리얼 값의 합을 구하시오 (2중for만 이용)
		
		/* 분석
		 * 
		 * 팩토리얼은 각 수까지의 곱한값을 말한다
		 * 예를들어 
		 * 2는 1*2
		 * 5는 1x1=1 1x2=2 2x3=6 6x4=24 24x5=120
		 * 출력은 1의 팩토리얼값은 얼마
		 * 2의 팩토리얼값은 얼마
		 * 10의 팩토리얼값은 얼마
		 *
		 * 
		 */ 
		
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			int fac=1;
			for (int j = 1; j <= i; j++) {
				fac *= j;
			} sum +=fac;
		} System.out.println(sum);

	}

}
