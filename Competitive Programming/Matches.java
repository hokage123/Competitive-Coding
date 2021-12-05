import java.util.*;
import java.io.*;
class Matches
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
		int T;
		long N,M;
		int a,i,j;
		FastReader sc=new FastReader();
		BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb=new StringBuilder();
		//Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		for(i=0;i<T;i++)
		{
			a=0;
			N=sc.nextLong();
			M=sc.nextLong();
			while(N!=0 && M!=0)
			{
				if(N>M)
				{
					if((N/M)%2!=0 && (N%M)!=0 && (N/M)>1)
					a+=2;
					else
						a++;
					
					N%=M;
				}
				else
				{
					if((M/N)%2!=0 && (M%N)!=0 && (M/N)>1)
					a+=2;
					else
						a++;
					M%=N;
				}
			}
			if(a%2!=0)
				sb=sb.append("Ari\n");
			else
				sb=sb.append("Rich\n");
		}
		bf.write(sb.toString());
		bf.close();
	}
}