package _052for;

public class _Q04 {

	public static void main(String[] args) {
		// *******
		// 0*****
		// 00***
		// 000*
		
		for (int i = 1; i < 4; i++) {
			for (int j = 7; j <= j - i + 1 ; j--) {
				if(j <= 8 - i) {
					System.out.print("0");
				} else {
					System.out.print("*");
				}
			} System.out.println();
		}

	}

}
