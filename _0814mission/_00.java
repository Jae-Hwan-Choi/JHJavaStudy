package _0814mission;

import java.util.Scanner;

public class _00 {

	public static void main(String[] args) {
		//0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		/* 분석 
		 * 숫자 1개를 입력을 받아야 하니 Scanner 참조 객체를 사용한다.
		 * 입력 후 엔터를 쳐야 하니 버퍼를 지우는 in.nextInt()를 사용
		 * 홀짝을 구분해야 하니 if ( % == 0)을 이용해 확인		 * 
		 */
		// int [] oddEven = new int[1];
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int k = in.nextInt(); // nextInt는 키보드로 숫자만 가져온다
		in.nextLine();
			
		if (k % 2 == 0) {
		System.out.println("짝수입니다");
		}else {
		System.out.println("홀수입니다");
		}

	
	}	
}
