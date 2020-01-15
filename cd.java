import java.lang.*;
import java.util.*;
class cd {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long t=1, c=0, d=0, l=0, n=1000000000,i;
		do {
			t=sc.nextInt();
		} while(!(t<=100000&&t>=1));
		for(i=1;i<=t;i++) {
			do {
				c=sc.nextInt();
				d=sc.nextInt();
				l=sc.nextInt();
			} while(!(c<=n&&d<=n&&l<=n&&c>=0&&d>=0&&l>=0));
			legs(c,d,l);
		}
	}
	private static void legs(long c,long d,long l) {
		long min=0,max=(c+d)*4;
		if(d*2-c>=0)
			min=d*4;
		else
			min=(c-d)*4;
		if(l<=max&&l>=min&&l%4==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}