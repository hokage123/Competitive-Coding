import java.io.*;
import java.util.*;
class ThreePilesofCandies
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int T,i;
		long a,b,c;
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{	
		a=sc.nextLong();
		b=sc.nextLong();
		c=sc.nextLong();
		System.out.println(((a+b+c)/2));
		}
	}
}