import java.io.*;
import java.util.*;
class AtmMachine
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
int T,K,M,A[],i,j;
String count;
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuffer sb=new StringBuffer();
T=sc.nextInt();
for(i=0;i<T;i++)
{
count="";
K=sc.nextInt();
A=new int[K];
M=sc.nextInt();
for(j=0;j<K;j++)
A[j]=sc.nextInt();
for(j=0;j<K;j++)
{
if(M>=A[j])
{
M-=A[j];
count=count+"1";
}
else
count+="0";
}
sb=sb.append(count+"\n");
}
bw.write(sb.toString());
bw.close();
}
}