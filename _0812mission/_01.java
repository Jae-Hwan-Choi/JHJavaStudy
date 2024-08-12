package _0812mission;

public class _01 {

	public static void main(String[] args) {
		// 배열의 가장 큰 수가 있는 인덱스를 출력하시오
		int max = 0;
		int maxIndex = -1;
		int [] letter = {8,12,4,13,2,14,4,5};
		for (int i = 0; i < letter.length; i++) {
			if (letter[i] > max) {
				max = letter[i];
				maxIndex = i;
			} 
		} System.out.println(maxIndex);

	}

}
