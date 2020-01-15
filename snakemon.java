import java.util.*;
class snakemon {
	public static void main(String args[]) {
		int t,i,sn,mg;
		String s,c;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0) {
			s=sc.next();
			c="";
			sn=mg=0;
			for(i=0;i<s.length();i++) {
				if(i==s.length()-1)
					c+=s.charAt(i);
				else if(s.substring(i,i+2).equals("sm")||s.substring(i,i+2).equals("ms")) {
					c+="m";
					i++;
				}
				else
					c+=s.charAt(i);
			}
			for(i=0;i<c.length();i++) {
				if(c.charAt(i)=='s')
					sn++;
				else
					mg++;
			}
			if(sn>mg)
				System.out.println("snakes");
			else if(sn<mg)
				System.out.println("mongooses");
			else
				System.out.println("tie");
		}
	}
}