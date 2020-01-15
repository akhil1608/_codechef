import java.lang.*;
import java.util.*;
class tower {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int s,n,t,i,sum=0,l,r;
		s=sc.nextInt();
		while(s-->=1) {
			n=sc.nextByte();
			int h[]=new int[n];
			for(i=0;i<n;i++)
				h[i]=sc.nextInt();
			sum+=h[0]-1;
			h[0]=1;
			for(i=1;i<(n+1)/2;i++) {
				if(h[i]==0||i<0)
					continue;
				else if(h[i]-h[i-1]>1) {
					sum+=h[i+1]-h[i];
					h[i+1]=h[i];
				}
				else if (h[i]-h[i-1]<1) {
					h[i-1]-=1;
					sum+=1;
					i=i-3;
				}
			}
			for(i=0;i<n;i++)
				System.out.println(h[i]+" ");
		}
	}
}