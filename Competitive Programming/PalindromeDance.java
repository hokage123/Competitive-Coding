import java.io.*;
import java.util.*;
class PalindromeDance
{
	public static void main(String[] o)
	{
		int n,i,wc,bc,cost=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		wc=sc.nextInt();
		bc=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<=(n/2);i++)
		{
			if(!(a[i]==a[n-1-i] || a[i]==2 || a[n-i-1]==2))
				cost=-1;
		}
		if(cost==0)
		{	
		for(i=0;i<n;i++)
		{
			if(a[i]==2 && a[n-1-i]==0)
			{
				a[i]=0;
				cost+=wc;
			}
			else if(a[i]==2 && a[n-1-i]==1)
			{
				a[i]=1;
				cost+=bc;
			}
			else if(a[i]==2 && a[n-1-i]==2)
			{
				if(wc<bc)
				{
					a[i]=0;
					cost+=wc;
				}
				else
				{
					a[i]=1;
					cost+=bc;
				}
			}
		}
		}
		System.out.println(cost);
	}
}