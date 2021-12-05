import java.util.*;
import java.io.*;
class Devuhisfriendsandbirthdaygifts
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
		int T,N,i,j;
		int[] f,count;
		long sum,cost[];
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			sum=0;
			N=sc.nextInt();
			f=new int[N];
			count=new int[N];
			cost=new long[N];
			for(j=0;j<N;j++)
			{
				f[j]=sc.nextInt();
				count[f[j]]++;
			}
			for(j=0;j<N;j++)
			{
				cost[j]=sc.nextLong();
			}
			for(j=0;j<N;j++)
			{
				if((cost[j]+cost[f[j]-1])>0)
				{
					sum+=(cost[j]+cost[f[j]-1]);
					cost[j]=0;
					cost[f[j]-1]=0;
				}
				
			}
			sb=sb.append(sum+"\n");
		}
		bf.write(sb.toString());
		bf.close();	
	}
}