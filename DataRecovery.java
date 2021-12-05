import java.util.*;
import java.io.*;
class DataRecovery
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
public static void main(String[] u)throws IOException
{
int T,i;
long N;
long ans;
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuffer sb=new StringBuffer();
T=sc.nextInt();
for(i=0;i<T;i++)
{
N=sc.next().length();
if(N%2==0)
ans=((N/2)*(N/2));
else
ans=(((N+1)/2)*((N-1)/2));
sb=sb.append(""+ans).append("\n");
}
bw.write(sb.toString());
bw.close();
}
}