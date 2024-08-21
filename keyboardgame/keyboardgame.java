package keyboardgame;

import java.util.Random;
import java.util.Scanner;

public class keyboardgame {
	// 색상 코드 정의
	public static final String RESET = "\u001B[0m";  
	public static final String RED = "\u001B[31m";   
	public static final String BLUE = "\u001B[34m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";


	public static void main(String[] args) {
		// 타자게임을 만들어보자
		// 게임의 간단한 기능 
		// 주어진 데이터를 뽑아 출력하고 입력받은 데이터가 true인지 확인
		// true이면 +20점
		// false면 점수없음
		// 총 5문제를 풀고 점수를 합산
		// 합산된 점수를 토대로 등급 출력(ex. 초등학생 수준입니다 중학생 수준입니다)
		// 
		
		/* 풀이
		 * 배열을 만들고 그중 랜덤으로 1개의 단어를 출력한다 
		 * 출력된 단어가 Scanner 객체를 이용해 입력받은 단어가 출력된 단어와 동일한지 확인한다
		 * 단어가 맞으면 정답(true)을 출력하고 점수를 추가후 다음 반복으로 간다
		 * 단어가 틀리면 오답(false)을 출력하고 다음 반복으로 간다 
		 * 총 5회를 반복하고 반복이 끝나면 점수를 출력한다
		 * 처음에 이름을 입력 받았다면 이름과 점수를 출력한다
		 * 
		 * 입력받을 Scanner객체
		 * 배열중 단어를 랜덤하게 뽑아낼 Random 객체
		 * 20번의 배열을 반복 단어를 출력할 for문
		 * 점수를 5점씩 누적시킬 sum++
		 */
		
		String[] key = {"종달새","키보드","노트북","모니터","볼펜","스피커","형광등","칠판","선생님"
				,"텀블러","윤율킹왕짱","보드","안경","마스크","책상","의자","이어폰","종이","빨대","선풍기",
				"에어컨","콘솔","설렁탕","곰탕","아이스크림","하드","소프트","노말","비빔밥","순대","떡볶이",
				"코딩","동상이몽","데일리","굿잡","스마트폰","덮밥","불고기","소갈비","돼지갈비","스테이크","닭가슴살"
				,"타코야키","데스크탑","그래픽카드","라면","사과","김치","바게트","토마토","복숭아","피자","콜라",
				"사이다","국수","김밥","Just","바나나","샐러드","오렌지","스파게티","케익","초콜릿","파스타","치킨"
				,"만두","짬뽕","우동","햄버거","핸드위치"};
				
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
			System.out.println("총 몇문제가 필요하십니까?(숫자로만 입력해 주세요) : ");
			num = sc.nextInt();
			sc.nextLine();
			System.out.println(name+"님 다음 출력된 단어를 입력하세요 총 "+num+"문제입니다.");
			
			for (int i=0; i < num; i++) {
				String randomWord = key[r.nextInt(key.length)]; // key 배열에서 랜덤 단어를 추출
				System.out.println(randomWord); // 추출한 단어 출력
				a = sc.nextLine(); // 단어 입력받아 a변수로 저장
				if(randomWord.equals(a)) { // a변수와 randonWord equals로 비교
					sum += 100.0/num;
					cnt++; // 비교후 맞다면 개당 점수를 더하고 평균을 나누기 위해 정답숫자 카운팅
					System.out.println(GREEN+"정답입니다"+RESET);
				}else {					
					System.out.println(RED+"오답입니다"+RESET);
				}
					 
			}
			System.out.println(name+"님의 총점은 "+YELLOW+sum+RESET+"점 정확도는 "+BLUE+(cnt/(double)num)*100+RESET+"% 입니다" );
				if (sum >= 90) {
					System.out.println(name+"님의 등급은"+GREEN+" A "+RESET+"입니다");
				} if (sum >= 80 && 90 > sum) {
					System.out.println(name+"님의 등급은"+GREEN+" B "+RESET+"입니다");
				} if (sum >= 70 && 80 > sum) {
					System.out.println(name+"님의 등급은"+GREEN+" C "+RESET+"입니다");
				} if (sum >= 60 && 70 > sum) {
					System.out.println(name+"님의 등급은"+GREEN+" D "+RESET+"입니다");
				} if (sum < 60) {
					System.out.println(name+"님의 등급은"+GREEN+" F "+RESET+"입니다");
				}
			System.out.println("다시 실행하겠습니까? (예/아니오) : ");
			pa = sc.nextLine();
		} while (pa.equals("예")); // pa에 입력한 글자와 비교 동일하면 do로 이동
		System.out.println("프로그램을 종료합니다"); 
		sc.close(); // 예가 아니면 종료
	}

}

