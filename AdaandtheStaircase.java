import java.util.*;
import java.io.*;
class AdaandtheStaircase
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
int T,N,K,A[],i,j,ans=0;
FastReader sc=new FastReader();
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(i=0;i<T;i++)
{
	ans=0;
N=sc.nextInt();
K=sc.nextInt();
A=new int[N];
for(j=0;j<N;j++)
{
A[j]=sc.nextInt();
if(j!=0)
{
	ans+=((A[j]-A[j-1])/K);
if((A[j]-A[j-1])%K==0 && (A[j]-A[j-1])/K!=0)
	ans--;
}
else
{
	ans+=((A[j])/K);
if((A[j])%K==0 && (A[j])/K!=0)
	ans--;
}
	}
sb=sb.append(ans+"\n");
}
bw.write(sb.toString());
bw.close();
}
}