import java.util.*;
class fence {
	public static void main(String args[]) {
		int t,n,h,v,i,j;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-->0) {
			n=sc.nextInt();
			v=h=0;
			char mat[][]=new char[2][n];
			for(i=0;i<2;i++) {
				String s=sc.next();
				for(j=0;j<n;j++)
					mat[i][j]=s.charAt(j);
			}
			// for(i=0;i<2;i++)
			// 	for(j=0;j<n;j++)
			// 		System.out.print(mat[i][j]+" ");
			// System.out.println();
			if(n!=1) {
				for(j=0;j<n-1;j++) {
					i=0;
					if(mat[i][j]=='*') {
						System.out.println("enter1");
						if(h==0) {
							if(mat[i+1][j]=='*')
								h++;
							else if(mat[i+1][j+1]=='*')
								h++;
							if(mat[i][j+1]=='*')
								v++;
						}
						else
							if(mat[i][j+1]=='*')
								v++;
					}
					if(mat[i+1][j]=='*') {
						System.out.println("enter2");
						if(h==0) {
							if(mat[i-1][j+1]=='*') 
								h++;
							if(mat[i][j+1]=='*')
								v++;
						}
						else
							if(mat[i][j+1]=='*')
								v++;
					}
				}
			}
			else
				if(mat[0][0]=='*'&&mat[1][0]=='*')
					h++;
			System.out.println(v+h);
		}
	}
}