import java.io.*;
import java.util.*;
class SplitStones
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
int T,i;
long a,b,c,x,y;
FastReader sc=new FastReader();
T=sc.nextInt();
String ans[]=new String[T];
for(i=0;i<T;i++)
{
ans[i]="NO";
a=sc.nextLong();
b=sc.nextLong();
c=sc.nextLong();
x=sc.nextLong();
y=sc.nextLong();
if((x>=a || x>=b || x>=c) && (y>=a || y>=b || y>=c))
{
if((a+b+c)==(x+y))
ans[i]="YES";
}
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
}