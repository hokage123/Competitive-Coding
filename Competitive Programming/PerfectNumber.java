import java.io.*;
import java.util.*;
class PerfectNumber
{
	public static void main(String[] g)
	{
		int sum=0,i=0;
		Scanner sc=new Scanner(System.in);
		int dp[]=new int[10001];
		dp[1]=19;
		for(i=2;i<=10000;i++)
		{
			sum=dp[i-1]+9;
			while(sumdigi(sum)!=10)
				sum+=9;
			dp[i]=sum;
		}
		System.out.println(dp[sc.nextInt()]);
	}
	static int sumdigi(int n)
	{
		int count=0;
		while(n>0)
		{
			count+=n%10;
			n/=10;
		}
		return count;
	}
}