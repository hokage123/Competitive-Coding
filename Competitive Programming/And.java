import java.util.*;
import java.io.*;
class And
{
	public static void main(String[] d)
	{
		int count[]=new int[100001];
		int count1[]=new int[100001];
		int n,i,x,c=0,min=0,min1=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		x=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			count[a[i]]++;
		}
		for(i=0;i<n;i++)
		{
			count1[a[i]&x]++;
		}
		for(i=0;i<100001;i++)
		{
			if(count[i]>=2)
			{
				System.out.println("0");
				c=1;
				break;
			}
		}
		if(c==0)
		{
			for(i=0;i<100001;i++)
			{
				if(count1[i]>=2)
				{
					min=(2-count[i]);	
					if(min1==0)
					{
						min1=min;
					}
					else if(min<min1)
						min1=min;
				}
				else if(count[i]==1 && count1[i]==0 && count[i&x]==1 && count1[i&x]==1)
					min1=1;
				
			}
			if(min1==0)
				System.out.println("-1");
			else 
				System.out.println(min1);
		}
	}
}