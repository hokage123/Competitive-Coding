import java.util.*;
import java.io.*;
class MysteriousWeek
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
int T,N,X,i,j,A[],ans[];
FastReader sc=new FastReader();
T=sc.nextInt();
ans=new int[T];
for(i=0;i<T;i++)
{
N=sc.nextInt();
X=sc.nextInt();
A=new int[N];
for(j=0;j<N;j++)
A[j]=sc.nextInt();
while(X>0)
{
for(j=0;j<N;j++)
{
X=X-A[j];
if(X<=0)
{
ans[i]=j+1;
break;
}
}
}
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
}