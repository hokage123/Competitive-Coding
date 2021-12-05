import java.io.*;
import java.util.*;
import java.math.BigInteger;
class ChefAndMortalCombat
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
int T,N,K,i,j,count,a1[],a2[];
String ans[];
FastReader sc=new FastReader();
T=sc.nextInt();
ans=new String[T];
for(i=0;i<T;i++)
{
ans[i]="NO";	
count=0;	
N=sc.nextInt();
K=sc.nextInt();
a1=new int[N];
a2=new int[N];
for(j=0;j<N;j++)
a1[j]=sc.nextInt();
for(j=0;j<N;j++)
a2[j]=sc.nextInt();
Arrays.sort(a1);
Arrays.sort(a2);
if(a1[0]<a2[N-1])
{
for(j=0;j<K;j++)
if(a1[K-j-1]<a2[N-1-j])	
count++;
if(count==K)
	ans[i]="YES";
	}
}
for(i=0;i<T;i++)
System.out.println(ans[i]);	
}
}