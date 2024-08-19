package _052for;

public class _Q01 {

	public static void main(String[] args) {
		// 구구단
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(i+"단");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
		}
		
	}

}
