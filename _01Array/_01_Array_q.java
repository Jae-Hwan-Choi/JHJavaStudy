package _01Array;

public class _01_Array_q {

	public static void main(String[] args) {
		// 08-06 조별 문제풀이
		// 기본 문제1
//		int[] array_a = new int[4];
		int[] array_a = {30, 40, 50, 60, 55};
		System.out.println(array_a[0]+"/"+array_a[1]+"/"+array_a[2]+"/"+array_a[3]+"/"+array_a[4]);
		// 기본 문제2
		String[] nameFirst = {"kim","lee","park"};
		System.out.println(nameFirst[0]+"/"+nameFirst[1]+"/"+nameFirst[2]);
		// 기본 문제3
		int[] lotto = {6,12,33,4,5,26};
		System.out.println(lotto[2] + 2);
		// 기본 문제4
		int lottoSum = lotto[0] + lotto[2] + lotto[4];
		System.out.println(lottoSum);
		// 중 문제5
		lotto[0] = lotto[0];
		lotto[1] = lotto[0] + lotto[1];
		lotto[2] = lotto[0] + lotto[1] + lotto[2];
		lotto[3] = lotto[0] + lotto[1] + lotto[2] + lotto[3];
		lotto[4] = lotto[0] + lotto[1] + lotto[2] + lotto[3] + lotto[4];
		lotto[5] = lotto[0] + lotto[1] + lotto[2] + lotto[3] + lotto[4] + lotto[5];
		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);
		// 중 문제6
		int[] lotto2 = {6,12,33,4,5,26};
		System.out.println(lotto[3] % 2 > 0 );
		// 중 문제7
		int money = 2750;
		int pay = 10000;
		int calcul = pay - money;
		System.out.println("천원"+calcul%10000/1000+"개, 백원"+calcul%1000/100+"개, 십원"+calcul%100/10+"개");
//		System.out.println("천원"+calcul/1000+"개, 백원"+(calcul%1000)/100+"개, 십원"+(calcul%100)/10+"개");
		// 중 문제8
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		
		int xC = 650;
		int yC = 300;
		
		
		System.out.println(xA <= xC && xC <= (xB-3) && (yB+3) < yC && yC <yA);
		// xA < xC < xB  => xA <= xC && xC <= (xB-3)
		// yB < yC < yA  => (yB+3) <= yC && yC <= yA
		
		///System.out.println((xA-xC) <= 0 && (xB-3)-xC >= 0 && (yB+3)-yC >= 0 && yA-yC <= 0);

	}

}
