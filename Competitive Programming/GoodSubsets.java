import java.util.*;
import java.io.*;
class GoodSubsets
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
int T,N,a[],i,j,k,count;
String[] s1,ans;
String s;
FastReader sc=new FastReader();
T=sc.nextInt();
ans=new String[T];
for(i=0;i<T;i++)
{	
ans[i]="NO";
count=0;
N=sc.nextInt();
s=sc.nextLine();
s1=s.split(" ");
a=new int[N];
for(j=0;j<N;j++)
a[j]=Integer.parseInt(s1[j]);	
for(j=1;j<N;j++)
{
	for(k=0;k<j;k++)
	{
		if(isHCF1(a[j],a[k]))
		{
			ans[i]="YES";
			count=1;
			break;
		}
	}
	if(count==1)
		break;
}	
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
static boolean isHCF1(int m,int n)
{
int	min,j;
	if(m<n)
		min=m;
	else
		min=n;
	for(j=2;j<=min;j++)
	{
		if((m%j==0) && (n%j==0))
			return false;
	}
	return true;
}
}