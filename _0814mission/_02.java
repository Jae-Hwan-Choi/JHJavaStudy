package _0814mission;

import java.util.Random;

public class _02 {

	public static void main(String[] args) {
		//행운의 숫자 인지를 판별해 보자
   		//1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
   		//이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
    	
		/*분석 
		 * 1 - 100까지의 숫자중 랜덤한 숫자 1을 뽑아야 하니 Random객체를 이용한다
		 * 뽑은 숫자를 배열에 저장한 뒤
		 * 7의 배수로 나눠 true 면 lucky, false면 danger를 출력한다
		 */

		Random r = new Random();
		// int [] ran = new int[1];
		int k = r.nextInt(100)+1;
		
		if(k % 7 == 0) {
			System.out.println("번호는 "+k+"입니다 Lucky");
		}else {
			System.out.println("번호는 "+k+"입니다 Danger");
		}
		
	}

}
