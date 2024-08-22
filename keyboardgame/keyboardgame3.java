package keyboardgame;

import java.util.Random;
import java.util.Scanner;

public class keyboardgame3 {
	// 글씨 색상
	public static final String RESET = "\u001B[0m";  
	public static final String RED_TEXT = "\u001B[31m";   
	public static final String BLUE_TEXT = "\u001B[34m";
	public static final String GREEN_TEXT = "\u001B[32m";
	public static final String YELLOW_TEXT = "\u001B[33m";
	public static final String CYAN_TEXT = "\u001B[36m";
	public static final String BLACK_TEXT = "\u001B[30m";
	// 바탕색
	public static final String WHITE_BG = "\u001B[47m";

	public static void main(String[] args) {
		
		/* 타자게임 설명
		 * 사용자의 이름을 입력받아
		 * 원하는 문제의 숫자만큼 출력하고
		 * 문제는 배열에 저장된 단어에서 출제 됩니다.
		 * 주어진 문제의 정답과 오답을 확인한 뒤
		 * 100점 만점 기준 총점과 정확도, 해당 등급을 확인합니다.
		 */

		
		
		String[] key = {"종달새","키보드","노트북","모니터","볼펜","스피커","형광등","칠판","선생님"
				,"텀블러","윤율킹왕짱","보드","안경","마스크","책상","의자","이어폰","종이","빨대","선풍기",
				"에어컨","콘솔","설렁탕","곰탕","아이스크림","하드","소프트","노말","비빔밥","순대","떡볶이",
				"코딩","동상이몽","데일리","굿잡","스마트폰","덮밥","불고기","소갈비","돼지갈비","스테이크","닭가슴살"
				,"타코야키","데스크탑","그래픽카드","라면","사과","김치","바게트","토마토","복숭아","피자","콜라",
				"사이다","국수","김밥","Just","바나나","샐러드","오렌지","스파게티","케익","초콜릿","파스타","치킨"
				,"만두","짬뽕","우동","햄버거"};
				
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		String a;
		String pa;
		String name;
		
		do {			// 다시 반복을 하기 위한 do while문 사용
			
			double sum = 0;
			int cnt = 0;
			int num = 0;
			System.out.println("이름을 입력해 주세요 : ");
			name = sc.nextLine();
			while(true) {
			System.out.println("총 몇문제가 필요하십니까?(숫자로만 입력해 주세요) : ");
				if (sc.hasNextInt()) {  // 입력한 숫자가 정수인지 확인
					num = sc.nextInt();
					sc.nextLine();
					break;  // 정수라면 반복문을 멈추고 진행
				}else {  	// 정수가 아니라면 다시 while문 시작으로 이동
					System.out.println("다시 입력해 주세요");	
					sc.nextLine();
				}
			}System.out.println("주어진 문제는 총 "+num+"문제 입니다");
			
			System.out.println(name+"님 다음 출력된 단어를 입력하세요");

			
			for (int i=0; i < num; i++) {
				String randomWord = key[r.nextInt(key.length)]; // key 배열에서 랜덤 단어를 추출
				System.out.println(WHITE_BG+RED_TEXT+randomWord+RESET+"를 정확하게 입력해 주세요"); // 추출한 단어 출력
				a = sc.nextLine(); // 단어 입력받아 a변수로 저장
				if(randomWord.equals(a)) { // a변수와 randonWord equals로 비교
					sum += 100.0/num;
					cnt++; // 비교후 맞다면 개당 점수를 더하고 평균을 나누기 위해 정답숫자 카운팅
					System.out.println(GREEN_TEXT+"정답입니다"+RESET);
				}else {					
					System.out.println(RED_TEXT+"오답입니다"+RESET);
				}
					 
			}
			System.out.println(name+"님의 총점은 "+YELLOW_TEXT+String.format("%.1f",sum)+RESET
					+"점 정확도는 "	+BLUE_TEXT+String.format("%.1f", (cnt/(double)num)*100)+RESET+"% 입니다" );
				if (sum >= 90) {
					System.out.println(name+"님의 등급은"+GREEN_TEXT+" A "+RESET+"입니다");
				} if (sum >= 80 && 90 > sum) {
					System.out.println(name+"님의 등급은"+GREEN_TEXT+" B "+RESET+"입니다");
				} if (sum >= 70 && 80 > sum) {
					System.out.println(name+"님의 등급은"+GREEN_TEXT+" C "+RESET+"입니다");
				} if (sum >= 60 && 70 > sum) {
					System.out.println(name+"님의 등급은"+GREEN_TEXT+" D "+RESET+"입니다");
				} if (sum < 60) {
					System.out.println(name+"님의 등급은"+GREEN_TEXT+" F "+RESET+"입니다");
				}
			System.out.println("타자 게임을 다시 실행하시겠습니까? (예/아니오) : ");
			pa = sc.nextLine();
			sc.close();
		} while (pa.equals("예")); // pa에 입력한 글자와 비교 동일하면 do로 이동 예가 아니면 종료
		System.out.println("프로그램을 종료합니다"); 
		
	}

}

