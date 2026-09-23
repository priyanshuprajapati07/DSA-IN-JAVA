import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
		    int t=sc.nextInt();
		    
		    while(t-- > 0){
		        int n=sc.nextInt();
		        int k=sc.nextInt();
		        int totalMinutes = n + (n- 1)/(k-1);
		        
		        System.out.println(totalMinutes);
		    }
		}
		sc.close();

	}
}
