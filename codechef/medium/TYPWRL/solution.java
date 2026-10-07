import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while (T-- > 0)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();

			String S = sc.next();
			String L = sc.next();

			int current = 1;
			int maxCount = 1;

			boolean previousLeft = L.indexOf(S.charAt(0)) != -1;

			for (int i = 1; i < N; i++)
			{
				boolean currentLeft = L.indexOf(S.charAt(i)) != -1;

				if (currentLeft == previousLeft)
				{
					current++;
				}
				else
				{
					current = 1;
				}

				if (current > maxCount)
				{
					maxCount = current;
				}

				previousLeft = currentLeft;
			}

			System.out.println(maxCount);
		}

		sc.close();
	}
}