import java.io.*;
import java.util.*;
class ChefAndModuloGame2
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
		int T,i;
		long N,P;
		long ans;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			N=sc.nextInt();
			P=sc.nextInt();
			if(N==1 || N==2)
			{
				ans=(P*P*P);
			}
			else if(N==P)
			{
				ans=((((N+P)/4)+1)*(((N+P)/4)+1));
			}
			else if(N%2==0 || N==3)
			{
				ans=((((2*P)-N-((N-1)/2))*(P-((N-1)/2)))+((P-N)*(P-N)));
			}
			else
			{
				ans=((((2*P)-N-((N-1)/2))*(P-((N-1)/2)))+((P-N)*(P-N)));
			}
			sb=sb.append(ans+" "+"\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}