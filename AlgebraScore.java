import java.util.*;
import java.io.*;
class AlgebraScore
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
int T,N,i,j,count;
long a[],myans[];
String o[];
FastReader sc=new FastReader();
T=sc.nextInt();
myans=new long[T];
for(i=0;i<T;i++)
{
long s=0;	
count=0;
N=sc.nextInt();
a=new long[N];
o=new String[N-1];
for(j=0;j<N;j++)
{	
a[j]=sc.nextLong();
if(j<(N-1))
o[j]=sc.next();
}	
for(j=0;j<(N-1);j++)
{
if(o[j]=="-" && count==0)
count=1;
else if(o[j]=="+" && count==1)
count=0;
else if(o[j]=="-" && count==1)
o[j]="+";
}
s=a[0];
for(j=0;j<(N-1);j++)
{
	
if(o[j]=="+")
{
s+=a[j+1];
}
else if(o[j]=="-")
{
s-=a[j+1];
}
}
myans[i]=s;
}
for(i=0;i<T;i++)
System.out.println(myans[i]);
}
}