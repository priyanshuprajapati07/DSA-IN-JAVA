import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int M = sc.nextInt();
		int W = sc.nextInt();
		int P = sc.nextInt();
		int R = sc.nextInt();
		
		if(C*M - W*P >= R) System.out.println("YES");
		else System.out.println("NO");
		
	}
}
