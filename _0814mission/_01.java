package _0814mission;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {
		// 1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		/*분석
		 * 키보드로 입력을 받아야 하니 Scanner 객체를 이용합니다.
		 * 입력후 엔터를 칠테니 버퍼를 지웁니다  
		 * 배열을 만듭니다. int [] sumSum = new int[2]; 
		 * 2개의 숫자를 입력받아야 하니 반복문을 사용합니다. for문
		 * 입력받은 숫자를 저장할 변수를 만듭니다. int sum = 0;
		 * 입력을 받으면 출력할 반복문을 만듭니다. 
		 */

		int[] sumSum = new int[2];
		int sum = 0;		
		// 입력부
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < sumSum.length; i++) {
			System.out.println((i+1)+"번을 입력하세요");
			int k = in.nextInt(); // nextInt는 키보드로 숫자만 가져온다
			in.nextLine(); // 버퍼 지우기
			sumSum[i] = k; // 입력받은 k를 배열에 저장해라
			sum += sumSum[i];
		}
		// 출력부
		 System.out.println(sum);
	} 

}
