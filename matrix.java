import java.util.Scanner;
public class matrix {
	public static void main(String args[]) {
		int t,m,i,j;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			m = sc.nextInt();
			i = (int)Math.ceil(m/3.0);
			j = m-i;
			System.out.println(i+" "+j);
			t--;
		}
	}
}