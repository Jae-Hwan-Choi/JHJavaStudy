package _0814mission;

import java.util.Random;

public class _04 {

	public static void main(String[] args) {
		// 숫자 10개를 저장할수 있는 배열을 만들고 0부터 99숫자중 랜덤으로 10개를 뽑습니다.
		// 이중 짝수만 저장하고 홀수는 무시합니다.(다시 뽑지 않습니다.)
		// 0번째 번호 98이라면   0번 인덱스에 저장
		// 1번째 번호 97이라면   무시  1번 인덱스는 선언시 초기값
		// 2번째 번호 88이라면   2번  인덱스에 저장
		
		/* 분석
		 * 1-10까지 저장할 배열을 만듭니다
		 * random 객체를 이용해 0 - 99숫자중 하나를 뽑습니다.
		 * 배열에 짝수만 저장하고 홀수는 버리지만 다시 뽑지 않고 해당인덱스는 비웁니다
		 */
		Random r = new Random();
		int [] ran = new int[10];

		for (int i=0; i<ran.length; i++) {
			int k = r.nextInt(100);
			if (k % 2 == 0) {
				ran[i] = k;
			}else {
				ran[i] = -1;
		     }
		} System.out.println("출력된 숫자는"+ran[0]+" "+ran[1]+" "+ran[2]+" "
				+ran[3]+" "+ran[4]+" "+ran[5]+" "+ran[6]+" "+ran[7]+" "
				+ran[8]+" "+ran[9]+" 입니다 ");

	
	
	}
}
