import java.util.*;
import java.math.BigInteger;
import java.io.*;
class StrikeorSpare
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
public static void main(String[] o)throws IOException
{
int T,N,i,j;
BigInteger b=new BigInteger("10");
String s;
StringBuilder n=new StringBuilder();
FastReader sc=new FastReader();
BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
T=sc.nextInt();
for(i=0;i<T;i++)
{
	s="";
	N=sc.nextInt();	
	n=n.append("1 ").append(b.pow(N/2).toString()).append("\n");
}
bf.write(n.toString());
bf.close();
}
}