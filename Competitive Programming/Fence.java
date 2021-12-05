import java.io.*;
import java.util.*;
class Fence
{
	public static void main(String[] s)
	{
		int a[],dp[],n,k,min=Integer.MAX_VALUE,i,ans=-1;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		a=new int[n];
		dp=new int[n-k+1];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<k;i++)
			dp[0]+=a[i];
		for(i=1;i<(n-k+1);i++)
			dp[i]=(dp[i-1]-a[i-1]+a[i+k-1]);
		for(i=0;i<(n-k+1);i++)
		{
			min=Integer.min(dp[i],min);
		}
		for(i=0;i<(n-k+1);i++)
		{
			if(min==dp[i])
				ans=(i+1);
		}
		System.out.println(ans);
	}
}