import java.io.*;
import java.util.*;
class SpecialBullets
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
public static void main(String[] o)
{
int T,N,i,j,count;
int[] ans,ar;
FastReader sc=new FastReader();
T=sc.nextInt();
ans=new int[T];
for(i=0;i<T;i++)
{
count=0;
N=sc.nextInt();
ar=new int[N];
for(j=0;j<N;j++)
ar[j]=sc.nextInt();
for(j=0;j<N;j++)
{
if(j==0)
{
if(((ar[j]%ar[j+1])==0) && (ar[j]>ar[j+1]))
count++;
}
else if(j==(N-1))
{
if(((ar[j]%ar[j-1])==0) && (ar[j]>ar[j-1]))
count++;
	}
else
{
if(((ar[j]%ar[j+1])==0) && ((ar[j]%ar[j-1])==0) && (ar[j]>ar[j+1]) && (ar[j]>ar[j-1]))
count++;
}
}
ans[i]=count;
}
for(i=0;i<T;i++)
System.out.println(ans[i]);  
}
}