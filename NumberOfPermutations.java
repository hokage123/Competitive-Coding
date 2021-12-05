import java.util.*;
import java.io.*;
class NumberOfPermutations
{
	public static void main(String[] s)
	{
		int n,i;
		long n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		HashMap<Integer,Integer> hm1=new HashMap<>();
		HashMap<Integer,Integer> hm2=new HashMap<>();
		for(i=0;i<n;i++)
		{
			a=sc.nextInt();
			b=sc.nextInt();
			if(!hm1.containsKey(a))
				hm1.put(a,1);
			else
				hm1.put(a,(hm1.get(a)+1));
			if(!hm2.containsKey(b))
				hm2.put(b,1);
			else
				hm2.put(a,(hm1.get(b)+1));
		}
		for(Map.Entry<Integer,Integer> hm1:hm1.entrySet())
		{
			 n1=1;
			int v=e.getValue();
			for(i=1;i<=v;i++)
			{
				n1*=(v%998244353);
				n1%=998244353;
			}
		}
		for(i=1;i<=hm1.size();i++)
		{
			n1*=(i%998244353);
			n1%=998244353;
		}
		for(Map.Entry<Integer,Integer> hm2:hm2.entrySet())
		{
			 n2=1;
			int v=e.getValue();
			for(i=1;i<=v;i++)
			{
				n2*=(v%998244353);
				n2%=998244353;
			}
		}
		for(i=1;i<=hm2.size();i++)
		{
			n2*=(i%998244353);
			n2%=998244353;
		}
		if(n1==1 && n2==1)
		{	
		n3=998244352;
		}
		else
		{
			n3=(((n1*n2)-(n1+n2))%998244353);
		}
			
		System.out.println(n3);
	}
}