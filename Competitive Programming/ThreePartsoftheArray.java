import java.io.*;
import java.util.*;
class ThreePartsoftheArray
{
	public static void main(String[] s)
	{
		int n,a[],i;
		long sum1=0,max=0;
		HashMap<Long,Integer> hm=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum1+=a[i];
			hm.put(sum1,i);
		}
		sum1=0;
		for(i=0;i<n;i++)
		{
			sum1+=a[n-i-1];
			if(hm.containsKey(sum1))
			{
				int v=hm.get(sum1);
				if((v+i+2)<=n)
				{
					if(max<sum1)
					{
						max=sum1;
					}
				}
			}
		}
		System.out.println(max);
	}
}