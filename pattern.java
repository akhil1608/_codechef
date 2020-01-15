import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class pattern {
	public static void main(String args[]) {
		int t;
		String a,b;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
			a = sc.next();
			b = sc.next();
		 	HashMap<Character, Character> map = new HashMap<Character, Character>();     
			for(int i=0;i<b.length();i++)
				if(map.get((char)b.charAt(i))==null)
					map.put((char)b.charAt(i),(char)a.charAt(i));
			for(Map.Entry<Character,Character> m:map.entrySet()) 
   				a = a.replace(m.getValue(),(char)((int)m.getKey()-32));
   			a = a.toLowerCase();
			if(a.equals(b))
				System.out.println("YES");
			else
				System.out.println("NO");			
			t--;
		}
	}
}