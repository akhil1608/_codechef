import java.util.Scanner;
class reziba {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t,n,rb,i,l,r;
		t = sc.nextInt();
		while(t>0) {
			n = sc.nextInt();
			rb = sc.nextInt();
			int[] a = new int[n];
			for(i=0;i<n;i++) 
				a[i]=sc.nextInt();
			l = 0;
			r = 1000000001;
			char move = ' ';
			boolean flag = true;
			for(i=0;i<n-1;i++) {
				if(move=='l')
					if(l>a[i]||a[i]>a[i-1]) {
						flag = false;
						break;
					}
				if(move=='r')
					if(r<a[i]||a[i]<a[i-1]) {
						flag = false;
						break;
					}
				if(a[i]>rb) {
					move = 'l';
					r = a[i];
				}
				else {
					move = 'r';
					l = a[i];
				}
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
	}
}