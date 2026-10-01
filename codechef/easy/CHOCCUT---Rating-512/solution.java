import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i<t; i++){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    if(n%2 == 1 && m %2 ==1) System.out.println("No");
		    else System.out.println("Yes");
		}

	}
}
