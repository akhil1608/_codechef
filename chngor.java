import java.util.Scanner;
public class chngor {
	public static void main(String args[]) {
		int t,n,i,cost=0;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			n = sc.nextInt();
			int a[] = new int[n];
				for(i=0;i<n;i++) {
					a[i] = sc.nextInt();
					cost = cost|a[i];
				}
			t--;
		}
		System.out.println(cost);
	}
}