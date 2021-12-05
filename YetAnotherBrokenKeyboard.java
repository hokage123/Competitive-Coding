import java.io.*;
import java.util.*;
class YetAnotherBrokenKeyboard
{
	public static void main(String[] s)
	{
		int dp[],i;
		long sum=0;
		HashSet<Character> hs=new HashSet<>();
		Scanner sc=new Scanner(System.in);
		int n,v;
		n=sc.nextInt();
		v=sc.nextInt();
		dp=new int[n];
		char ch[]=sc.next().toCharArray();
		for(i=0;i<v;i++)
			hs.add(sc.next().charAt(0));
		for(i=0;i<n;i++)
		{
			if(hs.contains(ch[i]))
			{
				if(i==0)
					dp[i]=1;
				else
					dp[i]=dp[i-1]+1;
			}
			else
				dp[i]=0;
		}
		for(i=0;i<n;i++)
			sum+=dp[i];
		System.out.println(sum);
	}
}