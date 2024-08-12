package _03for;

public class _Q0809_13 {

	public static void main(String[] args) {
		// 숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int cnt = 1;
		int bt = arr[0];
		int maxLength = 0;
		int maxIndex = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]==bt) {
				cnt++;
			}else {cnt = 1; bt=arr[i];
			} // System.out.println(i+"/"+cnt); 
			if(maxLength< cnt) {
				maxLength = cnt;
				maxIndex = bt;
			}
		}System.out.println(maxLength);  System.out.println(maxIndex);
	}

}
