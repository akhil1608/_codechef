import java.lang.*;
import java.util.*;
class beaut {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=1, n, l=1000000,i;
		String s,r="[C]*[E]*[S]*";
		do {
			t=sc.nextInt();
		} while(!(t<=20&&t>=1));
		for(i=1;i<=t;i++) {
			do {
				s=sc.next();
				n=s.length();
			} while(!(n>=1&&n<=l));
			if(s.matches(r))
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}