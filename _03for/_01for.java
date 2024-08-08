package _03for;

public class _01for {

	public static void main(String[] args) {
		// 50이상의 점수를 합하시오
//		int sum=0;
//		int[] a= {30,40,50,55,60};
//		for (int i=0; i < 5; i++) {
//			if (a[i]>=50) {
//				sum += a[i] ;
//			}
//		} System.out.println(sum);

		// 50이상의 평균을 구하시오
		int sum=0;
		int cnt=0;
		int[] a= {30,40,50,55,60};
		for (int i=0; i < 5; i++) {
			if (a[i]>=50) {
				sum += a[i];
				cnt++;
			}
		}System.out.println((double)sum/cnt);
		// 평균을 구하시오 단 최저 점수는 포함하지 마시오
	
	
	
	}

}
