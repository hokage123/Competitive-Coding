import java.util.*;
import java.io.*;
class Vacations
{
	public static void main(String[] s)
	{
		Scanner sc=new Scanner(System.in);
		int dp=0,n,a[],i;
		n=sc.nextInt();
		a=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(i==0)
			{	
			if(a[i]==0)
				dp++;
			}
			else if(i==(n-1))
			{
				if(a[i]==0)
					dp++;
				else if(a[i-1]==a[i] && a[i]<3 )
					dp++;
			}
			else
			{
				if(a[i]==0)
					dp++;
				else if(a[i]==a[i-1] && a[i]!=3)
				{
					a[i]=0;
					dp++;
				}
				else if(a[i]==3 && a[i-1]==1)
					a[i]=2;
				else if(a[i]==3 && a[i-1]==2)
					a[i]=1;
				
			}		
				
		}
		System.out.println(dp);
	}
}