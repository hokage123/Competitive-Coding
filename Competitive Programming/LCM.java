import java.util.*;
import java.io.*;
class  LCM
{
	public static void main(String[] g)
	{
		long b,sum=1;
		Scanner sc=new Scanner(System.in);
		b=sc.nextLong();
		HashMap<Long,Integer> hm=factors(b);
		for(Map.Entry<Long,Integer> e:hm.entrySet())
		{
			int h=e.getValue();
			sum*=(h+1);	
		}
		System.out.println(sum);
	}
	static HashMap<Long,Integer> factors(long b)
	{
		HashMap<Long,Integer> hm=new HashMap<>();
		long l=2,i=0;
		if(b%l==0)
		{
			while(b%l==0)
			{
				if(hm.containsKey(l))
					hm.put(l,(hm.get(l)+1));
				else
					hm.put(l,1);	
					b/=l;
			}
		}
		for(l=3;l<=Math.sqrt(b);l+=2)
		{
			if(b%l==0)
			{
				
				while(b%l==0)
				{
					if(hm.containsKey(l))
						hm.put(l,(hm.get(l)+1));
					else
						hm.put(l,1);	
						b/=l;
				}
			}
		}
		if(b>2)
			hm.put(b,1);
			return hm;
	}
}