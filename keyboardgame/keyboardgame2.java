package keyboardgame;

import java.util.Random;
import java.util.Scanner;

public class keyboardgame2 {
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
		 * 원하는 문제의 숫자만큼 출력합니다
		 * 문제에 주어지는 문자는 랜덤으로 5개문자를 줄바꿈없이 출력하며
		 * 주어진 문제의 정답과 오답을 확인한 뒤
		 * 100점 만점 기준 총점과 정확도, 해당 등급을 확인합니다.
		 */

		
		
		String key = "abcdefghijklmnopqrstuvwxyz!@#$%^&*()1234567890";
				
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
				StringBuilder rs = new StringBuilder();
				for (int j = 0; j< 5; j++) {
					int index = r.nextInt(key.length());
					rs.append(key.charAt(index));
				}
				String add = rs.toString();
				System.out.println(WHITE_BG+RED_TEXT+add+RESET+"를 정확하게 입력해 주세요"); // 추출한 단어 출력
				a = sc.nextLine(); // 단어 입력받아 a변수로 저장
				if(add.equals(a)) { // a변수와 randonWord equals로 비교
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
		} while (pa.equals("예")); // pa에 입력한 글자와 비교 동일하면 do로 이동
		System.out.println("프로그램을 종료합니다"); 
		sc.close(); // 예가 아니면 종료
	}

}

