package _03for;

public class _Q0809_08v2 {

	public static void main(String[] args) {
		// 8.짝수는 모두 몇개인가요?
		int cnt = 0; 
		int[]arr = {45,23,25,64,3,24,48};
			for (int i=0; i<7; i++) {
				if (arr[i] % 2 == 0) {
					cnt++;					
				}				
			}System.out.println(cnt);
	}
	
	

}
