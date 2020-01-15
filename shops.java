import java.util.Scanner;
public class shops {
	public static void main(String args[]) {
		int t;
		long m,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			n = sc.nextLong();
			m = sc.nextLong();
			long min = (long)Math.ceil((Math.sqrt(m*8-1)-1)/2);
		 	if(min>n)
		 		System.out.println(-1);
		 	else
		 		System.out.println(min);
			t--;
		}
	}
}