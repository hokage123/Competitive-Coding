import java.math.BigInteger;
import java.util.*;
import java.io.*;
class BigMultiplication
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
public static void main(String[] f)
{
int T,i;
BigInteger m,n;
BigInteger b=new BigInteger("3");
String[] ans,s1;
String s;
FastReader sc=new FastReader();
T=sc.nextInt();
ans=new String[T]; 
for(i=0;i<T;i++)
{
s=sc.nextLine();
s1=s.split(" ");	
m=new BigInteger(s1[0]);
n=new BigInteger(s1[1]);
ans[i]=(((m.mod(b)).multiply(n.mod(b))).mod(b)).toString();
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
}