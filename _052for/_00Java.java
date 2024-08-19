package _052for;

public class _00Java {

	public static void main(String[] args) {
		// 
		for(int i=1; i<5; i++) {
			System.out.println("1 x "+i+" = "+(1*i));
		}
		
		for(int dan=1; dan<=9; dan++) {
			System.out.println(dan);
			for(int i=1; i <= 9; i++) {
				System.out.println(dan+" x "+i+" = "+(dan*i));
			}
		}
	}

}
