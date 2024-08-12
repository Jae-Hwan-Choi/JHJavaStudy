package _03for;

public class _14_Q {

	public static void main(String[] args) {
		// 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
	//	int[] arr = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 3 };
		String ttt = new String("aabbbcccaaaaddbbbaaaaa");
		int cnt = 0;
		char bT = ttt.charAt(0);
		int maxCnt = 0;
		char maxNumber;
		for (int i = 0; i < ttt.length(); i++) {
				cnt++;
			} else {
				bT = ttt.charAt(i);
				cnt = 1;
			}
			if (maxCnt < cnt) { 
				maxCnt = cnt;
				maxNumber = bT;
			}
		}
		System.out.println(maxCnt + "/" + bT); // 14번 문제 확인

	}

}
