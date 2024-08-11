package _03for;

public class _Q0809_06 {

	public static void main(String[] args) {
		// 6.배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오.
		int[] arr = {45,23,25,64,3,24,48};
		for (int i=0; i<7; i++) {
			if (arr[i] % 2 == 1) {
				System.out.println(i);
			}
		}
		
			

	}

}
