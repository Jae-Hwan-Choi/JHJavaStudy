package _0812mission;

public class _04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 0;
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i]+arr[i+1]==0) {
				cnt++;
				} 
		} System.out.println(cnt);
	}
}
