import java.io.*;
import java.util.*;
class SumandGcd
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
	public static void main(String[] d)throws IOException
	{
		int T,N,i,j,k,count;
		long A[],hcf,ans;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			hcf=0;
			N=sc.nextInt();
			A=new long[N];
			for(j=0;j<N;j++)
				A[j]=sc.nextLong();
			Arrays.sort(A);
			for(j=1;j<(N-1);j++)
			{
				if(j==1)
					hcf=hcf(A[j],A[j-1]);
				else
					hcf=hcf(A[j],hcf);
			}
			ans=A[N-1]+hcf;
			sb=sb.append(ans+"\n");
		}
		bf.write(sb.toString());
			bf.close();
	}
	public static long hcf(long a,long b)
	{
		if(a==0)
			return b;
		else
			return hcf(b%a,a);
	}
}