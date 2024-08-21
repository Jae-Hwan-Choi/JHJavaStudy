package _052for;

public class _Q2_01_2 {

	public static void main(String[] args) {
		// a로 나누어 떨어지는 배열의 값을 모두 출력하시오.
		
		/* 분석
		 * 각각 확인을 해야하니 반복문
		 * 평균을 구하는 문제이니 arr[i]%a = 0
		 * 이걸 이중for로?
		 * i = a?
		 * j = arr?
		 * if문으로 돌면서 5인지 아닌지 확인?  
		 */
		
		
		int[] arr = {3,45,26,50,74};
		int a = 5;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= arr.length; j++) {
				if (arr[i] % a == 0) {
					System.out.println(arr[i]);
					break;
				}
			}
			
		}

	}

}
