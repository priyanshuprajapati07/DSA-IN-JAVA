import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int h = sc.nextInt();
		int c = sc.nextInt();
		
		int ans1 = b/2;
		int ans2 = h+c;
		if(ans1<ans2) System.out.println(ans1);
		else System.out.println(ans2);

	}
}
