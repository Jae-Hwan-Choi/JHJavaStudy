package _01Array;

public class test02 {

	public static void main(String[] args) {
		// 기본 문제 1 30, 40, 50, 60, 55를 배열에 저장하고 모든 배열의 값을 출력하시오
		int [] number = {30, 40, 50, 60, 55};
		System.out.println(number[0]+" "+number[1]+" "+number[2]+" "+number[3]+" "+number[4]);

		// 기본 문제 2 kim lee park 3개의 값을 배열에 저장하고 출력하시오
		String [] name = {"kim", "lee", "park"};
		System.out.println(name[0]+" "+name[1]+" "+name[2]);
		
		// 기본 문제 3 3번째 값에 +2를 더하시오
		int [] lo = {6,12,33,4,5,26};
		System.out.println(lo[2]+2);
		
		// 기본 문제 4 홀수 번째로 뽑은 번호의 총 합을 구하시오, 단 저장된 로또 번호의 값은 유지
		lo[2] = 33;
		System.out.println(lo[0]+lo[2]+lo[4]);
		
		// 중 문제 5 다음 규칙에 의해서 저장된 값을 수정하세요. 첫번째 번호는 그대로 그 이후 +n   
		lo[1] = lo[0]+lo[1];
		lo[2] = lo[1]+lo[2];
		lo[3] = lo[2]+lo[3];
		lo[4] = lo[3]+lo[4];
		lo[5] = lo[4]+lo[5];
		System.out.println(lo[0]+" "+lo[1]+" "+lo[2]+" "+lo[3]+" "+lo[4]+" "+lo[5]);
		
		
		lo[1] = 12;
		lo[2] = 33;
		lo[3] = 4;
		lo[4] = 5;
		lo[5] = 26;
		// 중 문제 6 4번째 로또번호가 홀수이면 true, 짝수이면 false를 출력하시오
		int a = lo[3];
		System.out.println(a % 2 != 0);
		
		// 거스름돈을 구해보자
		int money = 2750;
		int pay = 10000;
		
		int payb = pay - money;
		
		int pay1 = (payb - 250) / 1000;
		int pay2 = (payb - 7050) / 100;
		int pay3 = (payb - 7200) / 10;
		
		System.out.println("천원 "+pay1+"개, 백원 "+pay2+"개, 십원 "+pay3+"개");
		
	}

}
