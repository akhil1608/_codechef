import java.util.Scanner;
class subinv {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n,u,max=0;
		String s="";
		n=sc.nextInt();
		u=sc.nextInt();
		for(int i=0;i<n;i++)
			s+=0;
		while(u-->0) {
			int l=sc.nextInt();
			int r=sc.nextInt();
			String ss=s.substring(l-1,r);
			s=s.substring(0,l-1)+sc(ss,r-l+1)+s.substring(r,n);
			if(Integer.parseInt(s)>max)
				max=Integer.parseInt(s);
		}
		System.out.println(max);
	}
	private static String sc(String s,int l) {
		String n="";
		for(int i=0;i<l;i++)
			n += (s.charAt(i)+1)%2;
		return n;
	}
}