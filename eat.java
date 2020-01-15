import java.util.Scanner;
import java.util.Arrays;
class eat {
	public static void main(String[] arg) {
		Scanner sc=new Scanner(System.in);
		int n,q,k,t,i,j,p,m,c;
		t=sc.nextInt();
		while(t>0) {
			n=sc.nextInt();
			q=sc.nextInt();
			int[] l=new int[n];
			for(i=0;i<n;i++)
				l[i]=sc.nextInt();
			Arrays.sort(l);
			while(q>0) {
				p=-1;c=0;
				i=0;j=n-1;
				k=sc.nextInt();
				if(l[0]>=k)
					c=n;
				else if((l[n-1]+(n-1))<k)
					c=0;
				else {
					while(i<=j) {
						m=(i+j)/2;
						if(l[m]<k)
							i=m+1;
						else if(l[m]>k)
							j=m-1;
						else {
							p=m;
							break;
						}
					}
					if(p==-1)
						p=j;
					else {
						for(i=p;l[i]==k;i--);
						p=i;
					}
					c=n-1-p;
					i=p;
					while((k-l[i])<=p) {
						p-=k-l[i]+1;
						c++;
						i--;
					}
				}
				System.out.println(c);
				q--;
			}
			t--;
		}
	}
}