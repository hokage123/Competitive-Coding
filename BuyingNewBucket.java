import java.util.*;
import java.io.*;
class BuyingNewBucket
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
	public static void main(String[] u) throws IOException
	{
		int T,N,B,W,H,P,A,i,j;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			A=0;
			N=sc.nextInt();
			B=sc.nextInt();
			for(j=0;j<N;j++)
			{
				W=sc.nextInt();
				H=sc.nextInt();
				P=sc.nextInt();
				if(P<=B && A<(W*H))
				{
					A=(W*H);
				}
			}
			if(A==0)
			{
				sb=sb.append("no tablet\n");
			}
			else
			{
				sb=sb.append(A+"\n");
			}
		}
		bf.write(sb.toString());
			bf.close();
	}
}