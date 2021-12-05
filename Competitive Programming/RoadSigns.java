import java.util.*;
import java.io.*;
class RoadSigns
{
	static class FastReader
	{
	BufferedReader bf;
	StringTokenizer st;
	public FastReader()
	{
		bf=new BufferedReader(new InputStreamReader(System.in));
	}
	String next()
	{
	while(st==null || !st.hasMoreElements())
	{
		try
		{
			st=new StringTokenizer(bf.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		return st.nextToken();
	}
	int nextInt()
	{
		return Integer.parseInt(next());
	}
	float nextFloat()
	{
		return Float.parseFloat(next());
	}
	long nextLong()
	{
		return Long.parseLong(next());
	}
	double nextDouble()
	{
		return Double.parseDouble(next());
	}
	String nextLine()
	{
		String str="";
		try
		{
			str=bf.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return str;
	}
	}
	public static void main(String[] s)throws IOException
	{
		int T,f,i,j,c;
		long K;
		HashSet<Character> hs;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			c=0;
			K=sc.nextLong();
			
			sb.append(((modpow(2,K-1,1000000007)*10)%1000000007)+"\n");
		}
		bf.write(sb.toString());
			bf.close();
	}
	static long modpow(long a,long b,long mod)
	{
		long c;
		if(b==0)
			return 1;
		else if(b%2==0)
		{
			c=modpow(a,b/2,mod);
			return (c*c)%mod;
		}
		else
		{
			c=modpow(a,b-1,mod);
			return (a*c)%mod;
		}
	}
}