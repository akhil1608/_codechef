import java.util.Scanner;
public class travelal {
	public static void main(String args[]) {
		int t,n,i,j;
		long min,max;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		sc.nextLine();
		while(t>0) {
			max = 0;
			n = sc.nextInt();
			int special[][] = new int[n][2];
			for(i=0;i<n;i++) {
				special[i][0] = sc.nextInt();
				special[i][1] = sc.nextInt();
			}
			for(i=0;i<n-1;i++) {
				min = distance(special[0][0],special[0][1],special[1][0],special[1][1]);
				for(j=i+1;j<n;j++) {
					long d = distance(special[i][0],special[i][1],special[j][0],special[j][1]);
					if(d<min)
						min = d;
				}
				if(min>max)
					max = min;
			}
			System.out.println(max);
			t--;
		}
	}
	private static long distance(int x1,int x2,int y1,int y2) {
		return (long)Math.abs(x2-x1)+(long)Math.abs(y2-y1);
	} 
}