import java.io.*;
import java.util.*;
import java.math.BigInteger;
class MCQGame
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
public static void main(String[] u)
{
int T,i,N;
BigInteger b=new BigInteger("1");
BigInteger b1=new BigInteger("1000000007");
FastReader sc=new FastReader();
T=sc.nextInt();
BigInteger K;
String d;
String[] count,s;
s=new String[2];
count=new String[T];
for(i=0;i<T;i++)
{
d=sc.nextLine();
s=d.split(" ");
N=Integer.parseInt(s[0]);
K=new BigInteger(s[1]);
count[i]=K.pow(N+1).subtract(b).divide(K.subtract(b)).subtract(b).mod(b1).toString();
}
for(i=0;i<T;i++)
System.out.println(count[i]);
}
}