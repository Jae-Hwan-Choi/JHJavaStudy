package _02if;

public class _01_pointgame {

	public static void main(String[] args) {
		// step 1
//		int point = 40;
//		int x = 0;
//		if (x <= 1) {
//			System.out.println("추가포인트 포함"+((point+10)+(point/10))+"점 입니다");
//		} else if (x <= 12) {
//			System.out.println("10점을 획득하여 "+(point+10)+"점 입니다");
//		} else if (x <= 20){
//			System.out.println("9점을 획득하여 "+(point+9)+"점 입니다");
//		} else if (x <= 30) {
//			System.out.println("8점을 획득하여 "+(point+8)+"점 입니다");
//		} else {
//			System.out.println("7점을 획득하여 "+(point+7)+"점 입니다");
//		}
//	
		// 선생님 버전 up1
		int point = 40;
		int x = 0;
		if(x>=0 && x <= 12) {
			if(x>=0 && x<=1) {
				point += point*0.1;
			}
			point+=10;
		}else if(x <=20) {
			point+=9;
		}else if(x <=30) {
			point+=8;
		}else if(x >30 ) {
			point+=7;
		}
		System.out.println(point);
	}
}
