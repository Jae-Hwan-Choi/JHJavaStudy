package _04Random;

import java.util.Scanner;

public class _01test {

	public static void main(String[] args) {
		// 수동 로또게임 만들기
		// 1부터 45까지를 비코드로 입력한다.
		// 이전에는 랜덤기능이 필요해서 Random 랠체가 필요했지만
		// 지금은 키도드로 입력하기 위한 기능이 필요하므로 Scanner 객체 필요

		// 배열 저장 변수
		int[] lotto = new int[6];
		// 키보드로 부터 입력받기 위한 객체 만들기
		Scanner in = new Scanner(System.in); // ctrl shift o
		
		// 0번째 번호부터 로또 번호 입력받기
		for(int i = 0; i < lotto.length; i++) {
			System.out.println((i+1)+"번을 입력하세요");
			int k = in.nextInt(); // nextInt는 키보드로 숫자만 가져온다
			in.nextLine(); // 버퍼 지우기
			lotto[i]=k;
		}
		// 로또 번호를 출력하기 위한 반복문
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length -1) {
				System.out.println("보너스 : " + lotto[i]);
			}else {
				System.out.println(lotto[i]);
			}
		}
	}

}
