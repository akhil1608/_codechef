import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
public class pairs {
	public static void main(String args[]) {
		int t,n,i,j,c;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		sc.nextLine();
		while(t>0) {
			c=0;
			n = sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for(i=0;i<n;i++) {
				int inp = sc.nextInt();
				if(inp<=n)
					arr.add(inp);
			}
			Set<Integer> hs = new HashSet<>();
			hs.addAll(arr);
			arr.clear();
			arr.addAll(hs);
			Collections.sort(arr);
			for(i=0;i<arr.size()-1;i++)
				for(j=i+1;j<arr.size();j++)
					if((arr.get(i)|arr.get(j))<=arr.get(j))
						c++;
			System.out.println(c);
			t--;
		}
	}
}