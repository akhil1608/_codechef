import java.util.Scanner;
public class schar {
	public static void main(String args[]) {
		int t,i,cost=0;
		String s;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			s = sc.next();
			s = s.toLowerCase();
			for(i=0;i<s.length()-1;i++) {
				int c = s.lastIndexOf(s.charAt(i));
				if(c!=-1&&c>i)
					i = c-1;
				else {
					cost += (int)Math.abs((int)s.charAt(i)-(int)s.charAt(i+1));
					System.out.println(cost);
				}
			}
			System.out.println(cost);
			t--;
		}
	}
}