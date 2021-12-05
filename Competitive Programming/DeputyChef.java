import java.io.*;
import java.util.*;
class DeputyChef
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
		int T,N,A[],B[],i,j,max,count;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			max=-1;
			N=sc.nextInt();
			A=new int[N];
			B=new int[N];
			for(j=0;j<N;j++)
				A[j]=sc.nextInt();
			for(j=0;j<N;j++)
				B[j]=sc.nextInt();
			for(j=0;j<N;j++)
			{
				if(j==0)
					count=A[j+1]+A[N-1];
				else if(j<(N-1))
					count=A[j+1]+A[j-1];
				else
					count=A[0]+A[j-1];
				if(B[j]>count && B[j]>max)
					max=B[j];
			}
			sb=sb.append(max+"\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}