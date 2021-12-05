import java.util.*;
import java.io.*;
class ChefandParty
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
	public static void main(String[] h)throws IOException
	{
		int T,N,A[],i,j,sum;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			sum=0;
			N=sc.nextInt();
			A=new int[N];
			for(j=0;j<N;j++)
			{
				A[j]=sc.nextInt();
			}
			Arrays.sort(A);
			for(j=0;j<N;j++)
			{
				if(A[j]==0)
					sum++;
				else if(A[j]<=sum)
					sum++;
				else
					break;
			}
			sb=sb.append(sum+"\n");
		}
		bf.write(sb.toString());
			bf.close();
	}
}