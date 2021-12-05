import java.util.*;
import java.io.*;
class DistinctPrimes
{
	public static void main(String[] d)
	{
		int T;
		int i=2;
		ArrayList<Integer> ar=new ArrayList<>();
		while(ar.size()<1000)
		{
			if(primefactors(i)>=3)
				ar.add(i);
			i++;
		}
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
			System.out.println(ar.get(sc.nextInt()-1).toString());
		
	}
	public static int primefactors(int x)
	{
		int j=2,count=0;
			if((x%j)==0)
			{
				count++;
				while(x%j==0)
				{
					x/=j;
				}
			}
		for(j=3;j<=Math.sqrt(x);j++)
		{
			if((x%j)==0)
			{
				count++;
				while(x%j==0)
				{
					x/=j;
				}
			}
		}
		if(x>2)
			count++;
		return count;
	}
}