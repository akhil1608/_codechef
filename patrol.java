import java.util.Scanner;
public class patrol {
	public static void main(String args[]) {
		long u,v;
		int t,x;
		double secs=0;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			u = sc.nextLong();
			v = sc.nextLong();
			x = sc.nextInt();
			secs = (double)(x)/(u+v);
			System.out.println(secs);
			t--;
		}
	}
}