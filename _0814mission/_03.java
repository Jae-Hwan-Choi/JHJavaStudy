package _0814mission;

import java.util.Random;

public class _03 {

	public static void main(String[] args) {
		// 1-100까지의 숫자를 1개를 랜덤하게 출력한다. 이 숫자가 7의 배수면 Lucky
		// 아니면 7의 배수가 나올때까지 반복한다 
		
		/*분석
		 * 즉 무조건 7의 배수가 나와야 함
		 * boolean을 사용할수 있음 해봐(근데 이해를 아직 못함)
		 * Random 객체를 이용해 숫자 1개만 뽑아내 배열에 저장한다 
		 * 출력된 숫자가 7의 배수인지 확인하고 7의 배수가 아니라면 continue
		 * 7의 배수가 맞다면 Lucky 출력 
		 */
		
		Random r=new Random();
		int[] ran = new int[1];
		for (int i=0;; i++) {
		int k = r.nextInt(100)+1;
		ran[0] = k;
			if (ran[0] % 7 != 0) {
				continue;
				}break;			
		} System.out.println("번호는 "+ran[0]+"입니다 Lucky");
		

	}

}
