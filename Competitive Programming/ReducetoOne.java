import java.util.*;
import java.io.*;
class ReducetoOne
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
	public static void main(String[] f)throws IOException
	{
		
		int T,N,i;
		long j;
		long a=0,s=1000000007,ans[],b=0,an;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		//Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		ans=new long[1000001];
		ans[1]=1;
		a=1;
		for(j=2;j<=(1000000);j++)
			{
				if(j==2)
				{
					a*=j;
					a*=(j+1);
					a%=s;
				}
				else
				{
					a*=(j+1);
					a%=s;
				}
				ans[(int)j]=a;
			}
		for(i=0;i<T;i++)
		{
			a=1;
			N=sc.nextInt();
			if(ans[N]==0)
			{
				an=(s-1);
			}
			else
				an=(ans[N]-1);
			if(N==1)
			    an=1;
			sb=sb.append(an+"\n");
		}
		bf.write(sb.toString());
		bf.close();
		
	}
	static long myMod(long j,long s)
	{
		if(j==1)
		return 1;
		else
			return((((j+1)*(myMod((j-1),s)))+j)%s);
	}
}