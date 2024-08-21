package _052for;

public class _Q03 {

	public static void main(String[] args) {
		// 000*
		// 00***
		// 0*****
		// *******
		
		/* 선생님 풀이
		 * 0이 하나씩 줄면서 *이 두개씩 늘어남
		 * 
		 */
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4 + i - 1; j++) {
				if (j <= 4 - i) {
					System.out.print("0");
				}else {
					System.out.print("*");
				}
			} System.out.println();
		}

	}

}
