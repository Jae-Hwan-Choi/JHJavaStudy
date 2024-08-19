package _052for;

public class _02test {

	public static void main(String[] args) {
		// String id = "abc*"; id
		// String sign = *^$; 특수문자를 정의 
		// 문) id에 특수문자가 있는가
		
		/* 문자열중에 특수문자를 찾아야 하니 각 문자를 뽑아내야 하네
		 * (풀이 적던중 선생님 풀이 시작됨)
		 * 
		 * 1. sign의 0번 문자열부터 찾는다 : 먼저 i
		 * 2. id의 0번 문자가 특수문자인가 : 나중 j
		 * 
		 * i = 0   i = 1   i = 2
		 * j = 0   j = 0   j = 0
		 *     1       1       1
		 *     2       2       2
		 *     3       3       3
		 */
		
		String id ="abc*";
		String sign ="*^%";
		int cnt = 0; // 특수문자 카운트
		for(int i = 0; i < sign.length(); i++) {
			for(int j = 0; j <id.length(); i++) {
				if(sign.charAt(i)==id.charAt(j)) {
					cnt++;
				}
			}
		} if (cnt > 0) {
			System.out.println("특수문자 포함");
		}
		
	}

}
