import java.util.*;
import java.io.*;
class BalancedRatingChanges
{
	public static void main(String[] d)
	{
		int n,i,sum1=0,sum2=0,count1=0,count2=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				if(a[i]>0)
				{
					sum1+=(a[i]/2);
					count1++;
				}
				else 
				{
					sum2-=(a[i]/2);
					count2++;
				}
			}
			else
			{
				if(a[i]>0)
				{
					sum1+=(a[i]/2);
				}
				else 
				{
					sum2-=(a[i]/2);
				}
			}
		}
		int x1=sum1;
		int x2=sum2;
		System.out.println(sum1);
		System.out.println(sum2);
		int y1,y2;
		if(x1<x2)
		{
			 y1=(x2-x1);
			 y2=0;
		}
		else
		{
			y2=(x1-x2);
			 y1=0;
		}
		for(i=0;i<n;i++)
			b[i]=(a[i]/2);
		for(i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				if(a[i]>0)
				{
					if(y1>0)
					{
						y1--;
						b[i]++;
					}
				}
				else 
				{
					if(y2>0)
					{
						y2--;
						b[i]--;
					}
				}
			}
		}
		for(i=0;i<n;i++)
			System.out.println(b[i]);
	}
}