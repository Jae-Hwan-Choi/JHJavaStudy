package _0812mission;

public class _02 {

	public static void main(String[] args) {
		// 범인을 찾으세요 범인은 짝수이며 가장 큰 수입니다
		int max = 0;
		int [] letter = {8,12,4,13,2,14,4,5};
		for (int i = 0; i < letter.length; i++) {
			if (letter[i]%2==0) {
				if (letter[i] > max) {
					max = letter[i];
				}
			}
		} System.out.println(max);
		
	}

}
