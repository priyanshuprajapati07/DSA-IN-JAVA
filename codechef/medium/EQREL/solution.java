import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Check if there's input available to prevent NoSuchElementException
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            int[] array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }
            
            int min = array[0];
            for (int i = 1; i < n; i++) { // Optimization: Start from index 1 since min is already array[0]
                if (array[i] < min) {
                    min = array[i];
                }
            }

            long sum = 0;
            for(int i = 0; i < n; i++){
                sum += (long) array[i] - min; // Safeguard against overflow during math operations
            }
            System.out.println(sum);
        }
    }
}
