import java.util.*;
import java.io.*;
class SonyaandHotels
{
	public static void main(String[] s)
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		long k=sc.nextLong();
		HashSet<Long> hs=new HashSet<>();
		long a[]=new long[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextLong();
		Arrays.sort(a);
		if(n==1)
		{
			hs.add((a[0]-k));
			hs.add((a[0]+k));
		}
		else
		{	
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
				hs.add((a[i]-k));
				if((a[i+1]-a[i])>=(2*k))
					hs.add((a[i]+k));
			}
			else if(i==(n-1))
			{
				hs.add((a[i]+k));
				if((a[i]-a[i-1])>=(2*k))
					hs.add((a[i]-k));
			}
			else
			{
				if((a[i+1]-a[i])>=(2*k))
					hs.add((a[i]+k));
				if((a[i]-a[i-1])>=(2*k))
					hs.add((a[i]-k));
			}
				
		}
		}
		System.out.println(hs.size());
	}
}