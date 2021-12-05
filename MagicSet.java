import java.util.*;
import java.io.*;
class MagicSet
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
public static void main(String[] r)
{
int T,M,N,counts,i,j;
int[] a;
long[] myCount;
FastReader sc=new FastReader();
T=sc.nextInt();
myCount=new long[T];
for(i=0;i<T;i++)
{
N=sc.nextInt();
M=sc.nextInt();
a=new int[N];
for(j=0;j<N;j++)
a[j]=sc.nextInt();
counts=0;
for(j=0;j<N;j++)
{
if(a[j]%M==0)
counts++;
}
myCount[i]=(long)(Math.pow(2,counts)-1);
}
for(i=0;i<T;i++)
System.out.println(myCount[i]);
}
}