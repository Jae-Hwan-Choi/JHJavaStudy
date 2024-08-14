package _0814mission;

import java.util.Random;

public class _05 {

	public static void main(String[] args) {
		// 로또번호를 자동으로 생성하는 게임을 작성하시오.
		// 중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오
		
		/* 분석
		 * 6개의 번호를 뽑기위해 Random 객체를 이용합니다.
		 * 45+1까지 제한합니다
		 * 출력된 번호를 배열에 저장하고 출력합니다
		 * 
		 * Random r = new Random();
		 * for (int i=0;i<6;i++) {
		 * int num = r.nextInt(45)+1;			  
		 * System.out.print(num+" ") -> 동일하게 나옴
		 */
		Random r = new Random();
		int [] num = new int[6];
		for (int i=0;i<num.length;i++) {
			int k = r.nextInt(45)+1;
			num[i] = k;			
		} System.out.print("로또번호는 "+num[0]+" "+num[1]+" "+num[2]+" "
				+num[3]+" "+num[4]+" "+num[5]+"입니다");
	}

}
