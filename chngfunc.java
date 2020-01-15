import java.util.Scanner;
public class chngfunc {
	public static void main(String args[]) {
		int a,b,i,j,count=0;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		for(i=1;i<=b/2;i++) {
			j = 2*i+1;
			int k = j;
			while(j<=b) {
				System.out.println(i+","+j);
				k+=2;
				j+=k;
				count++;
			}
		}
		System.out.println(count);
	}
}