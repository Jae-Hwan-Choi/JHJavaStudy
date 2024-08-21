package _052for;

public class _Q2_02 {

	public static void main(String[] args) {
		// 배열의 평균값을 구하시오. 소수점 표현하시오. 
		
		/* 분석
		 * 배열의 평균을 더하려면 모든 인덱스를 순회하며 그 앞을 더한 후 
		 * double 변수로 소수점까지 평균을 내야함
		 * 모두 더한 값과 인덱스의 숫자를 카운팅해야함
		 * 총합은 
		 * 
		 */
		
		
		double van = 0;
		int cnt = 0;
		int[] arr = {89,90,91,92,93,94,95,96,97,98,99};
		for(int i = 0; i < arr.length; i++) { 	//배열의 순회
			for(int j = 1; j<=arr.length; j++) {						
			} van += arr[i];
			cnt++;
		}System.out.println(van/cnt);

	}

}
