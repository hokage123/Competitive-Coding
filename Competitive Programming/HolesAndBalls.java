 import java.util.*;
import java.io.*;
class HolesAndBalls
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
		int N,M,A[],count[],B[],count1[],i,j;
	FastReader sc=new FastReader();
	N=sc.nextInt();
	A=new int[N];
	count=new int[N];
	for(i=0;i<N;i++)
		A[i]=sc.nextInt();
	M=sc.nextInt();
	B=new int[M];
	count1=new int[M];
	for(i=0;i<M;i++)
		B[i]=sc.nextInt();
	for(i=0;i<M;i++)
	{
		for(j=(N-1);j>=0;j--)
		{
			if(B[i]<=A[j] && count[j]<(j+1))
			{	
				count[j]++;
				count1[i]=(j+1);
				break;
			}
		}
	}
	for(i=0;i<M;i++)
		System.out.print(count1[i]+" ");
	}
}