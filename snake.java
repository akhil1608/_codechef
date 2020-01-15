import java.lang.*;
import java.util.*;
class snake {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int r,l;
		String s,p="([.])*([.]*[H][.]*[T][.]*)*";
		r=sc.nextInt();
		while(r-->=1) {
			l=sc.nextInt();
			s=sc.next();
			if(s.matches(p))
				System.out.println("Valid");
			else
				System.out.println("Invalid");
		}
	}
}