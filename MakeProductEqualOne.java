import java.io.*;
import java.util.*;
class MakeProductEqualOne
{
	public static void main(String[] s)
	{
		int n,a[],i,count0=0,count1=0,count2=0;
		long sum=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==0)
				count0++;
			if(a[i]>0)
				count1++;
			if(a[i]<0)
				count2++;
		}
		if(count0==0)
		{
			if(count2%2==0)
			{
				for(i=0;i<n;i++)
				{
					if(a[i]<0)
						sum+=(-(a[i]+1));
					else
						sum+=(a[i]-1);
				}
			}
			else
			{
				for(i=0;i<n;i++)
				{
					if(a[i]<0)
						sum+=(-(a[i]+1));
					else
						sum+=(a[i]-1);
				}
				sum+=2;
			}
		}
		else
		{
		    
			for(i=0;i<n;i++)
				{
					if(a[i]<0)
						sum+=(-(a[i]+1));
					else if(a[i]>0)
						sum+=(a[i]-1);
				}
				sum+=count0;
		}
		System.out.println(sum);
	}
}