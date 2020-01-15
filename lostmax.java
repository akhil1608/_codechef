import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class lostmax {
	public static void main(String args[]) {
		int t,n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		sc.nextLine();
		while(t>0) {
			ArrayList<Integer> arr=new ArrayList<Integer>();
			String line[] = sc.nextLine().split(" ");
			int l = line.length-1;
			for(int i=0;i<=l;i++)
				arr.add(Integer.parseInt(line[i]));
			arr.remove(new Integer(l));
			System.out.println(Collections.max(arr));
			t--;
		}
	}
}