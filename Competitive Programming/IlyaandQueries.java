import java.util.*;
import java.io.*;
class IlyaandQueries
{
	public static void main(String[] g)
	{
		int dp[],m,i;
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.next();
		char ch[]=s.toCharArray();
		dp=new int[ch.length];
		if(ch[0]==ch[1])
			dp[0]=1;
		for(i=1;i<ch.length;i++)
		{
			if(i==(ch.length-1))
				dp[i]=dp[i-1];
			else if(ch[i]==ch[i+1])
				dp[i]=(1+dp[i-1]);
			else
				dp[i]=dp[i-1];
		}
		m=sc.nextInt();
		for(i=0;i<m;i++)
		{
			int l=sc.nextInt();
			int r=sc.nextInt();
			if(l==1)
				System.out.println(dp[r-2]);
			else
				System.out.println((dp[r-2]-dp[l-2]));
		}
	}
}