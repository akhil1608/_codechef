import java.util.Scanner;
class samesnake
{
	public static void main(String[] arg)
	{
		Scanner sc=new Scanner(System.in);
		int t;
		int p[][]=new int[4][2];
		byte s1=2,s2=2;
		t=sc.nextInt();
		while(t>0)
		{
			for(byte i=0;i<4;i++) {
				p[i][0]=sc.nextInt();
				p[i][1]=sc.nextInt();
			}
			if(p[0][1]==p[1][1])
				s1=0;
			if(p[0][0]==p[1][0])
				s1=1;
			if(p[2][1]==p[3][1])
				s2=0;
			if(p[2][0]==p[3][0])
				s2=1;
			if(s1==2||s2==2) {
				System.out.println("no");
			}
			else {
				if(s1==0&&s2==0) {
					if(p[0][1]==p[2][1]) {
						if(Math.max(p[0][0],p[1][0])<Math.min(p[2][0],p[3][0])||Math.min(p[0][0],p[1][0])>Math.max(p[2][0],p[3][0]))
							System.out.println("no");
						else
							System.out.println("yes");
					}
					else
						System.out.println("no");
				}
				else if(s1==1&&s2==1) {
					if(p[0][0]==p[2][0]) {
						if(Math.max(p[0][1],p[1][1])<Math.min(p[2][1],p[3][1])||Math.min(p[0][1],p[1][1])>Math.max(p[2][1],p[3][1]))
							System.out.println("no");
						else
							System.out.println("yes");
					}
					else
						System.out.println("no");
				}
				else {
					if((p[0][0]==p[2][0]&&p[0][1]==p[2][1])||(p[0][0]==p[3][0]&&p[0][1]==p[3][1])||(p[1][0]==p[2][0]&&p[1][1]==p[2][1])||(p[1][0]==p[3][0]&&p[1][1]==p[3][1]))
						System.out.println("yes");
					else if(p[0][1]==p[1][1]&&p[0][0]==p[1][0]||p[2][1]==p[3][1]&&p[2][0]==p[3][0]) {
						if(p[0][1]==p[2][1])
							System.out.println("yes");
						else
							System.out.println("no");
					}
					else
						System.out.println("no");
				}
			}
			s1=s2=2;
			t--;
		}
	}
}