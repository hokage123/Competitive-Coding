import java.io.*;
import java.util.*;
class EqualizePrices
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
		int T,N,A[],i,j,k,min,max,x;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			k=sc.nextInt();
			A=new int[N];
			max=0;
			min=0;
			for(j=0;j<N;j++)
			{
				A[j]=sc.nextInt();
				if(j==0)
				{
					max=A[0];
					min=A[0];
				}
				if(min>A[j])
				{
					min=A[j];
				}
				if(max<A[j])
				{
					max=A[j];
				}
			}
			x=(min+k);
				if(((x-max)>=0) || ((max-x)>0 && ((max-x)<=k)))
					sb=sb.append(x+"\n");
				else
					sb=sb.append("-1\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}