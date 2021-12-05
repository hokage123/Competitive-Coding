import java.util.*;
import java.io.*;
class Interestingdrink
{
	public static void main(String[] h)
	{
		Scanner sc=new Scanner(System.in);
		int i,n,q,dp[],b[];
		n=sc.nextInt();
		dp=new int[100001];
		for(i=0;i<n;i++)
			dp[sc.nextInt()]++;
		for(i=1;i<=100000;i++)
			dp[i]+=dp[i-1];
		q=sc.nextInt();
		b=new int[q];
		for(i=0;i<q;i++)
		{
			b[i]=sc.nextInt();
			if(b[i]>100000)
				System.out.println(dp[100000]);
			else
				System.out.println(dp[b[i]]);
			
		}
	}
}