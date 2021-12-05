import java.io.*;
import java.util.*;
class MaximumIncrease
{
	public static void main(String[] d)
	{
		int dp[],a[],i,n,max=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n];
		dp=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		dp[0]=1;
		for(i=1;i<n;i++)
		{
			if(a[i]>a[i-1])
				dp[i]=(1+dp[i-1]);
			else
				dp[i]=1;
			
		}
		for(i=0;i<n;i++)
			max=Integer.max(dp[i],max);
		System.out.println(max);
	}
}