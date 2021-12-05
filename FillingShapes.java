import java.io.*;
import java.util.*;
class  FillingShapes
{
	public static void main(String[] d)
	{
		HashSet<Integer> hs=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		n*=3;
		for (int i=1; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
			{
				hs.add(i);
				hs.add(n/i);
			}
		}
		 if(n%2!=0)
			System.out.println(0);
		else
			System.out.println(((int)(Math.pow(2,(n/2)))));
	}
}