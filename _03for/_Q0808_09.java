package _03for;

public class _Q0808_09 {

	public static void main(String[] args) {
		/* 9. 피보나치 수열 2
		  i를 피보나치 수로 정의한다.
		  i의 변화는 1 1 2 3 5 8 13 이 된다.
		*/
		/* 1. 피보나치 수열
		 * 2. int i
		 * 3. 다음 피보나치수 공식 -> 이전 피보+현피보 = i
		*/
		int bint = 0;
		for(int i=1; i<20; ) {
			System.out.println(i);
			int temp=i; // 현재 i값 백업
			i=bint+i; // 다음 i값
			bint=temp; // 이전 bint에 현재 i값 저장
		}
		
	}

}
