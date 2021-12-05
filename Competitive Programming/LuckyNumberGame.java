import java.util.*;
import java.io.*;
class LuckyNumberGame
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
	public static void main(String[] y)throws IOException
	{
		int T,N,A[],i,j,a,b,m,n,o,ans1,ans2;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			a=sc.nextInt();
			b=sc.nextInt();
			A=new int[N];
			m=0;
			n=0;
			o=0;
			
			for(j=0;j<N;j++)
			{
				A[j]=sc.nextInt();
				if(A[j]%a==0 && A[j]%b!=0)
					m++;
				else if(A[j]%a!=0 && A[j]%b==0)
					n++;
				else if(A[j]%a==0 && A[j]%b==0)
					o++;
			}
			ans1=(m+o);
			ans2=n;
			if(ans1<=ans2)
				sb=sb.append("ALICE\n");
			else
				sb=sb.append("BOB\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}