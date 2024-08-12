package _03for;

public class _Q0809_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int cnt = 0;
		int maxLength = 0;
		for (int i=0; i<arr.length; i++) {
			// sysout("현재번호"+arr[i]);
			if (arr[i]==0) {
				cnt++;
			}else {cnt = 0;
			} if (cnt > maxLength) {
				maxLength = cnt;
			}
			
		} System.out.println(maxLength);// System.out.println(i+"/"+cnt);
	}

}
