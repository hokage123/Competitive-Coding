import java.util.*;
import java.io.*;
class BookAndPages
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
int N,T,ans,i,j;
double sum;
double myLog=Math.log(10);
FastReader sc=new FastReader();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
T=sc.nextInt();
for(i=0;i<T;i++)
{
ans=0;
sum=0.0;
N=sc.nextInt();
for(j=1;j<=N;j++)
sum+=(Math.log(j)/myLog);
sum*=N;
ans=(int)(sum+1);
sb=sb.append(ans).append("\n");
}
bw.write(sb.toString());
bw.close();
}
}