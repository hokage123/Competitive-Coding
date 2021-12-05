import java.util.*;
import java.io.*;
class Yogurt
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
public static void main(String[] d)
{
int T,N,ar[],count,myCount=0,m,i,j,K;
String ans[];
FastReader sc=new FastReader();
 T=sc.nextInt();
ans=new String[T];
 for(i=0;i<T;i++)
 {
 myCount=0;
 N=sc.nextInt();
 K=sc.nextInt();
 ar=new int[N];
 for(j=0;j<N;j++)
 ar[j]=sc.nextInt();
 Arrays.sort(ar);
 count=K;
 for(j=0;j<N;j++)
 {
	 if((ar[j]*count)>=(j+1))
		 myCount++;
	 count=(K+count-myCount);
 }
 ans[i]="Case #"+(i+1)+": "+myCount;
 }
 for(i=0;i<T;i++)
 System.out.println(ans[i]);
}
}