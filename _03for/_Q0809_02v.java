package _03for;

public class _Q0809_02v {

	public static void main(String[] args) {
		// 2. 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		
		int sump = 0;
		for (int i = 0; i <=100; i++) {
			if (i % 2 == 1){
				sump+=i;
			}
		} 
		System.out.println(sump);	
	}

}
