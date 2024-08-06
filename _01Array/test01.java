package _01Array;

public class test01 {

	public static void main(String[] args) {
		// 기본 문제 1 30, 40, 50, 60, 55를 배열에 저장하고 모든 배열의 값을 출력하시오
		int [] point = {30, 40, 50, 60, 55};
		System.out.println(point[0]+"/"+point[1]+"/"+point[2]+"/"+point[3]+"/"+point[4]);
		
		// 기본 문제 2 kim lee park 3개의 값을 배열에 저장하고 출력하시오
		String [] st = {"kim", "lee", "park"};
		System.out.println(st[0]+"/"+st[1]+"/"+st[2]);
		
		// 기본 문제 3 3번째 값에 +2를 더하시오
		int [] lotto = {6,12,33,4,5,26};
		System.out.println(lotto[2]+2);
		
		// 기본 문제 4 홀수 번째로 뽑은 번호의 총 합을 구하시오, 단 저장된 로또 번호의 값은 유지
		System.out.println(lotto[0]+lotto[2]+lotto[4]);
		
		// 중 문제 5 다음 규칙에 의해서 저장된 값을 수정하세요. 첫번째 번호는 그대로 그 이후 +n   
		//에러가 뭐가 문제였는지 모르겠음
		lotto[1]=lotto[0]+lotto[1];
		lotto[2]=lotto[1]+lotto[2];
		lotto[3]=lotto[2]+lotto[3];
		lotto[4]=lotto[3]+lotto[4];
		lotto[5]=lotto[4]+lotto[5];
		System.out.println(lotto[0]+"/"+lotto[1]+"/"+lotto[2]+"/"+lotto[3]+"/"+lotto[4]+"/"+lotto[5]);

		// 중 문제 6 4번째 로또번호가 홀수이면 true, 짝수이면 false를 출력하시오
		int [] lotto2 = {6,12,33,4,5,26};
		int a = lotto2[3] % 2;
		System.out.println(a == 0);
		
		// 거스름돈을 구해보자  * 어렵다 어려워
		int money = 2750;
		int pay = 10000;
		int b = pay - money;
		System.out.println(b);
		int [] payb = {7,2,5};
		System.out.println("천원"+payb[0]+"개, 백원"+payb[1]+"개, 십원"+payb[2]+"개");
		
		// 문제 8 볼이 벙커에 빠졌는가? 빠졌으면 true, 안빠졌으면 false
		// 볼이 벙커에 완전히 들어와야 빠진것으로 간주합니다
		// 공은 가로 세로 3cm 정사각형이고 볼의 위치는 가변적이다
		// 볼의 위치에 따라 벙커에 빠졌는지 판별하시오 단위는 cm이다
		// 나는 독해부터 신경써야 할듯?
		// && ||
		
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		int xC = 650;
		int yC = 150;	
		int ballsize = 3;
		
		
				
		boolean aa = (xA - 3) >= (yA + 3);
		boolean bb = (xB - 3) >= (yB + 3);

		
	} 

}
