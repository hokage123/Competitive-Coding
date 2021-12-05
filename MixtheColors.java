import java.util.*;
import java.io.*;
class MixtheColors
{
	public static void main(String[] u)
	{
		int T,N,i,j;
		HashMap<Integer,Integer> hm;
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			hm=new HashMap<>();
			int sum=0;
			N=sc.nextInt();
			for(j=0;j<N;j++)
			{
				int a=sc.nextInt();
				if(!hm.containsKey(a))
					hm.put(a,1);
				else
					hm.put(a,(hm.get(a)+1));
			}
			for(Map.Entry<Integer,Integer> e:hm.entrySet())
			{
				int val=e.getValue();
				sum+=(val-1);
			}
			System.out.println(sum);
		}
	}
}