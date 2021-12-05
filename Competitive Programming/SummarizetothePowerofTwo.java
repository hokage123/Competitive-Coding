import java.io.*;
import java.util.*;
class SummarizetothePowerofTwo
{
	public static void main(String[] f)
	{
		int n,a,count=0,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		HashMap<Integer,Integer> hm=new HashMap<>();
		ArrayList<Integer> ar=new ArrayList<>();
		for(i=0;i<n;i++)
		{
			a=sc.nextInt();
			if(hm.containsKey(a))
				hm.put(a,(hm.get(a)+1));
			else
				hm.put(a,1);
		}
		for(i=1;i<=30;i++)
		{
			ar.add((int)(Math.pow(2,i)));
		}
		for(Map.Entry<Integer,Integer> e:hm.entrySet())
		{
			int k=e.getKey();
			int v=e.getValue();
			for(int b:ar)
			{
				if(hm.containsKey((b-k)))
				{
					if(k==(b-k) && v>1)
					{
						count+=v;
						break;
					}
					else
					{
						count+=v;
						break;
					}
				}
			}
		}
		System.out.println((n-count));
	}
}