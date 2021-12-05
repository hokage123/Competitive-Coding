import java.util.*;
import java.io.*;
class AppyandContest
{
	public static void main(String[] d)throws IOException
	{
		int T,i;
		long N,A,B,ans,K;
		Scanner sc=new Scanner(System.in);
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextLong();
			A=sc.nextLong();
			B=sc.nextLong();
			K=sc.nextLong();
			ans=((N/A)+(N/B)-(2*(N/(lcm(A,B)))));
			if(ans>=K)
				sb=sb.append("Win\n");
			else
				sb=sb.append("Lose\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
	static long gcd(long A,long B)
	{
		if(B==0)
			return A;
		else
			return gcd(B,A%B);
	}
	static long lcm(long A,long B)
	{
		if(A>B)
		return ((A*B)/gcd(A,B));
		else 
		return ((A*B)/gcd(B,A));	
	}
}