import java.util.*;
import java.io.*;
class FlippingGame
{
	public static void main(String[] f)
	{
		int i,n,a[],sum[],summax=0,totalones=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		sum=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==1)
			totalones++;
		}
		for(i=0;i<n;i++)
		{
			if(i==0)
			{
				if(a[i]==0)
					sum[i]=1;
				else
					sum[i]=0;
			}
			else
			{
				if(a[i]==0)
					sum[i]=Integer.max(sum[i],(sum[i-1]+1));
				else
					sum[i]=Integer.max(sum[i],(sum[i-1]-1));
			}
		}
		for(i=0;i<n;i++)
			summax=Integer.max(sum[i],summax);
		if(summax==0)
		System.out.println((totalones-1));
		else
		System.out.println((summax+totalones));	
	}
}