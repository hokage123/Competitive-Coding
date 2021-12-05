import java.util.*;
import java.io.*;
class KrishAndContainers
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
int n,m,a,b,i,j,q,k,count;
int[] ans,counts;
FastReader sc=new FastReader();
n=sc.nextInt();
m=sc.nextInt();
ans=new int[n];
for(i=0;i<n;i++)
ans[i]=0;
for(i=0;i<m;i++)
{
a=sc.nextInt();
b=sc.nextInt();
for(j=a-1;j<b;j++)
ans[j]+=1;
}
q=sc.nextInt();
counts=new int[q];
Arrays.sort(ans);
for(i=0;i<q;i++)
{
count=0;
k=sc.nextInt();
if(ans[n-1]>=k)
{	
for(j=0;j<n;j++)
{	
if(ans[j]>=k)
{
	count=(ans.length-j);
	break;
}
}
}
counts[i]=count;
}
for(i=0;i<q;i++)
System.out.println(counts[i]);	
}
} 