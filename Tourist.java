import  java.util.*;
import java.io.*;
class Tourist
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
public static void main(String[] d) throws IOException
{
int T,N,K,i,j;
long V,m;
String op[];
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
T=Integer.parseInt(sc.next());
for(i=0;i<T;i++)
{
N=Integer.parseInt(sc.next());
K=Integer.parseInt(sc.next());
V=Long.parseLong(sc.next());
op=new String[N];
for(j=0;j<N;j++)
op[j]=sc.next();
m=(((K%N)*(V%N))%N);
sb=sb.append("Case #").append(i+": ");
if((K*V)<N || (m>K))
{
for(j=((int)(m-K));j<((int)m);j++)
sb=sb.append(op[j]).append(" ");	
}	
else
{	
for(j=0;j<((int)m);j++)
sb=sb.append(op[j]).append(" ");
for(j=(int)(N-(K-m));j<N;j++)
sb=sb.append(op[j]).append(" ");
}
sb=sb.append("\n");
}
bw.write(sb.toString());
bw.close();
}
}