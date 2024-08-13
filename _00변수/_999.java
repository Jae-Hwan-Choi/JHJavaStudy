package _00변수;

public class _999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {34,2,35,8,31,45};
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				a[i]=a[i]+a[i+1];
				a[i+1]=a[i]-a[i+1];
				a[i]=a[i]-a[i+1];
			}
		}
		System.out.println(a[1]);	

	}

}

