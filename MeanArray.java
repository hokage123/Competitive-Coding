import java.util.*;
import java.io.*;
class MeanArray
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
public static void main(String[] g)
{
int N,i,j,k;
long[] a;
long sum,K,count=0,M;
FastReader sc=new FastReader();
N=sc.nextInt();
K=sc.nextLong();
a=new long[N];
for(i=0;i<N;i++)
a[i]=sc.nextLong();
if(a[0]==a[N-1])
{
M=N;	
if(a[0]<K)
count=((M*(M+1))/2);	
}	
else
{	
for(i=0;i<N;i++)
{
for(j=i;j<N;j++)
{
if(a[j]<(K*(j-i+1)))
{
sum=0;
k=i;
while(k<=j)
{
sum+=a[k];
if(sum>=(K*(j-i+1)))
break;
k++;
}
if(sum<(K*(j-i+1)))
	count++;
}
else 
	break;

//System.out.println(count);
}
}
}
System.out.println(count);
}
}