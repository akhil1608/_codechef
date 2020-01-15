import java.lang.*;
import java.util.*;
class crazy {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=1, a=0, b=0, n=1, l=1000000000,i;
		do {
			t=sc.nextInt();
		} while(!(t<=100000&&t>=1));
		for(i=1;i<=t;i++) {
			do {
				a=sc.nextInt();
				b=sc.nextInt();
				n=sc.nextInt();
			} while(!(a>=-l&&b<=l&&n>=1&&n<=l));
			int f=fib(a,b,n%6)%(l+7);
			if(f<0)
				f=f+l+7;
			System.out.println(f);
		}
	}
	private static int fib(int a,int b,int c) {
		int f=0;
		switch(c) {
			case 0: f=a-b; break;
			case 1: f=a; break;
			case 2: f=b; break;
			case 3: f=b-a; break;
			case 4: f=-a; break;
			case 5: f=-b; break;
		}
		return f;
	}
}