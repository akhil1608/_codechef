import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class rainbowa {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t,n,i,l,m,u,total,seq;
		boolean flag;
		t = sc.nextInt();
		while(t>0) {
			total = 0;
			flag = true;
			seq = 1;
			ArrayList<Integer> left = new ArrayList<Integer>();
			ArrayList<Integer> right = new ArrayList<Integer>();
			n = sc.nextInt();
			if(n%2==0) {
				m = -1;
				l = (n-1)/2;
				u = l+1;
			}
			else {
				m = (n-1)/2;
				l = m-1;
				u = m+1;
			}
			for(i=0;i<=l;i++) {
				int val = sc.nextInt();
				left.add(val);
			}
			if(m!=-1) {
				int val = sc.nextInt();
				if(val!=7)
					flag = false;
			}
			for(i=u;i<n;i++) {
				int val = sc.nextInt();
				right.add(val);
			}
			if(left.get(0)!=1||right.get(right.size()-1)!=1)
				flag = false;
			ArrayList<Integer> sorted_left = left;
			Collections.sort(sorted_left);
			ArrayList<Integer> temp = right;
			Collections.sort(temp);
			ArrayList<Integer> sorted_right = temp;
			Collections.reverse(sorted_right);
			if(!left.equals(sorted_left)||!right.equals(sorted_right)||!left.equals(temp))
				flag = false;
			if(flag)
				System.out.println("yes");
			else
				System.out.println("no");
			t--;
		}
	}
}