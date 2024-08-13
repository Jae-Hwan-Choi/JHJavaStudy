package _0812mission;

import java.util.Random;

public class _09 {

	public static void main(String[] args) {
		// 로또번호를 자동으로 생성하는 게임을 작성하시오.
		//중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		
		/* 랜덤 클레스를 만들고 r을 변수로 지정한다. 
		 * 랜덤으로 나올 숫자를 고를 객체를 만들고 그 수를 45까지만 나오도록 한다
		 * 랜덤으로 나오는 숫자는 0을 포함하니 +1를 더해 1~45까지 출력되도록 한다  
		 * num 변수를 6개를 나오게 한다.
		 */

		Random r = new Random();
		
		for (int i=0; i<6; i++) {
			int num = r.nextInt(45)+1;
			System.out.print(num+" ");
		} 
		
		
	}

}
