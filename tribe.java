import java.util.Scanner;
class tribe {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t,i,a,b;
		String s;
		t = sc.nextInt();
		while(t>0) {
			s = sc.next();
			a = b = 0;
			int temp = 0;
			char current ='.';
			for(i=0;i<s.length();i++) {
				if(s.charAt(i)=='A') {
					if(current=='A')
						a += temp;
					temp = 0;
					current = 'A';
					a++;
				}
				else if(s.charAt(i)=='B') {
					if(current=='B')
						b += temp;
					temp = 0;
					current = 'B';
					b++;
				}
				else
					temp++;
				System.out.println(temp);
			}
			System.out.println(a+" "+b);
			t--;
		}
	}
}