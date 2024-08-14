package _04Random;

import java.util.Random;

public class _00test {

	public static void main(String[] args) {
		// 6개의 랜덤한 로또번호 추출
		// 시나리오 랜덤한 숫자를 뽑아서 로또번호로 저장한다.

		// 랜덤한 번호를 추출하기 위한 객체 만들기
		Random r = new Random();
		
		// 로또를 저장할 배열
		int [] lotto = new int[6];  // -> 변수명, 길이, index

		// 랜덤한 번호를 여러개 뽑기 위한 반복문
		for (int i = 0 ; i < lotto.length; i++) {
			int k = r.nextInt(45)+1; // r변수를 참조하여 nextInt라는 기능을 호출, 리턴받은 수에 +1을 한다
			lotto[i] = k;
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
