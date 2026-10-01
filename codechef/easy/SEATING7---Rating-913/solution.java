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
		
		 while(t-->0){
		     int n = sc.nextInt();
		     int m = sc.nextInt();
		     int k = sc.nextInt();
		     
		     boolean[] arr = new boolean[n+1];
		     for(int i = 0; i<m; i++){
		         int x = sc.nextInt();
		         arr[x] = true;
		     }
		     for(int i = 1; i<=n; i++){
		         if(arr[i] == false && k>0){
		         System.out.print(i+" " );
		         k--;
		     }
		     
		 }
            System.out.println();
	}
}
}