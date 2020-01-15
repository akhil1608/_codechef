import java.util.Scanner;
public class equation {
	public static void main(String args[]) {
		int t,m,n,f=1;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			n = sc.nextInt();
			m = sc.nextInt();  
			f = 1;
			for(int i=1;i<=n;i++)
				f = (f+powermod(i,i,m))%m;
			System.out.println(f);			
			t--;
		}
	}
	private static int powermod(int i,int p,int m) {
		i = i % m;
		int pm = 1;
		while(p>0) {
			if (p%2==1) {
				pm *= i;
				pm = pm%m;
			}
			p /= 2;
			i = (i*i)%m;
		}
		return pm;
	}
}