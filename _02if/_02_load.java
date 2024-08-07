package _02if;

public class _02_load {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int my = 11;
		if (my >= a && my <= b) {
			System.out.println("도로위 a지점으로부터 "+(my-a)+"m 떨어져있습니다");
		} else {
			System.out.println("도로밖");
		}
	}

}
