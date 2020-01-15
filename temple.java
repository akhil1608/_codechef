import java.lang.*;
import java.util.*;
class temple {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int s,n,i;
		long sum;
		s=sc.nextInt();
		while(s-->=1) {
			sum=0;
			n=sc.nextInt();
			int h[]=new int[n];
			int k[]=new int[n];
			for(i=0;i<n;i++) {
				h[i]=sc.nextInt();
				k[n-i-1]=h[i];
			}
			long hh=calsum(h,n);
			long kk=calsum(k,n);
			if(hh>kk)
				System.out.println(kk);
			else
				System.out.println(hh);
		}
	}
	private static long calsum(int h[],int n) {
		long sum=0;
		int i,j,l,r,m,t;
		sum+=h[0]-1;
		h[0]=1;
		l=0;
		r=n-1;
		for(i=0;i<n;i++) {
			m=(l+r)/2;
			if(i<m) {
				if(h[i+1]-h[i]>1) {
					sum+=h[i+1]-h[i]-1;
					h[i+1]=h[i]+1;
				}
				else if (h[i+1]-h[i]<1) {
					sum+=h[i]-h[i+1]+1;
					h[i]=h[i+1]-1;
					if(h[i]==0) {
						t=l;
						for(j=i;j>=t;j--) {
							sum+=h[j];
							h[j]=0;
							l++;
						}
						i=l-1;
					}
					else if(i-2>-2)
						i-=2;
					else
						i=0;
				}
			}
			else if(i>m) {
				if(h[i-1]==0) {
					sum+=h[i];
					h[i]=0;
				}
				else if(h[i-1]-h[i]<1) {
					sum+=h[i]-h[i-1]+1;
					h[i]=h[i-1]-1;
				}
				else if(h[i-1]-h[i]>1) {
					sum+=h[i-1]-h[i]-1;
					h[i-1]=h[i]+1;
					i-=3;
				}
			}
// 			for(j=0;j<n;j++)
// 				    System.out.print(h[j]+" ");
// 		    System.out.println(sum);
		}
		return sum;
	}
}