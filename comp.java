import java.util.Scanner;
class comp {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n,l,i,c=0;
		String s;
		s=sc.next();
		l=s.length();
		while(Integer.parseInt(s)!=0) {
			for(i=l-1;i>=0;i--)
				if(s.charAt(i)=='1')
					break;
			String ss=s.substring(0,i+1);
			s=oc(ss,i+1)+s.substring(i+1,l);
			c++;
		}
		System.out.println(c);
	}
	private static String oc(String s,int l) {
		String n="";
		for(int i=0;i<l;i++)
			n += (s.charAt(i)+1)%2;
		return n;
	}
}