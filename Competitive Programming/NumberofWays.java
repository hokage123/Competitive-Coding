import java.util.*;
import java.io.*;
class NumberofWays
{
	public static void main(String[] d)
	{
		int n,a[],i,c=0;
		long Lef[],dp[],Rig[],count=0,subarrsum;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		Lef=new long[n];
		Rig=new long[n];
		dp=new long[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		Lef[0]=a[0];
		for(i=1;i<n;i++)
			Lef[i]=(Lef[i-1]+a[i]);
		Rig[n-1]=a[n-1];
		for(i=(n-2);i>=0;i--)
			Rig[i]=(Rig[i+1]+a[i]);
		
		if(Lef[n-1]%3==0)
		{
			subarrsum=(Lef[n-1]/3);
			c=0;
			for(i=2;i<n;i++)
				if(Rig[i]==subarrsum)
					c++;
			if(Lef[0]==subarrsum)
			{
				dp[0]=c;
			}
			for(i=1;i<(n-2);i++)
			{
				if(i==1)
				{
					if(Rig[i+1]==subarrsum && c>0)
						c--;
				}
				else
				{
					if(Rig[i+1]==subarrsum && c>0)
						c--;
				}
				if(Lef[i]==subarrsum)
					dp[i]=c;
			}		
			for(i=0;i<n;i++)
				count+=dp[i];
			System.out.println(count);
		}
		else
			System.out.println(0);
	}
}