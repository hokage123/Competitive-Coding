import java.io.*;
import java.util.*;
import java.math.BigInteger;
class MathematicalEquation
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
BigInteger b1,b2;
b2=new BigInteger("1000000009");	
int N,Q,i,m;
long K,A,B,count[];
String s,s1[];
Long l=1l;
ArrayList<Long> a,mycount;
a=new ArrayList<Long>();
mycount=new ArrayList<Long>();
FastReader sc=new FastReader();
N=sc.nextInt();
Q=sc.nextInt();
count=new long[Q];
s1=new String[Q];
for(i=0;i<N;i++)
{
A=sc.nextLong();	
B=sc.nextLong();
if(A==B)
{
	m=a.indexOf(2*A);
	if(m==-1)
	{
		a.add(2*A);
		mycount.add(l);
	}
	else
	{
		mycount.set(m,mycount.get(m)+1);
	}
}	
}
for(i=0;i<Q;i++)
{
K=sc.nextLong();		
	m=a.indexOf(K);
if(K%2==0)
{	
	if(m!=-1)	
{
count[i]=mycount.get(m).longValue();	
}
else
{
	count[i]=0;
}
}
else
{
	count[i]=0;
}	
	if(count[i]==0)
	s1[i]="-1";
else
{	
s=""+count[i];
b1=new BigInteger(s);
s1[i]=b1.modInverse(b2).toString();	
}
}
for(i=0;i<Q;i++)
{
if(i!=(Q-1))	
System.out.println(s1[i]);
else
System.out.print(s1[i]);	
}	
}
}