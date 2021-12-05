import java.io.*;
import java.util.*;
class OneTwo
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
int T,N,i,j,k;
long A[],count,sum;
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuffer sb=new StringBuffer();
T=sc.nextInt();
for(i=0;i<T;i++)
{
sum=0;	
count=0;
N=sc.nextInt();
A=new long[N];
for(j=0;j<N;j++)
{	
A[j]=sc.nextInt();
if(A[j]==1)
count+=1;
else
count+=2;	
}
sb=sb.append(count+"\n");	
}
bw.write(sb.toString());
bw.close();
}
}