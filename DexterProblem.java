import java.util.*;
import java.io.*;
class DexterProblem
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
int N,A[],B[],count,count1=0,c1=0,c2=0,i,j;
char gen[];
FastReader sc=new FastReader();
N=sc.nextInt();
A=new int[N];
B=new int[N];
gen=new char[N];
for(i=0;i<N;i++)
{
gen[i]=sc.next().charAt(0);	
A[i]=sc.nextInt();
B[i]=sc.nextInt();
}
for(i=1;i<=366;i++)
{
	c1=0;
	c2=0;
	count=0;
	for(j=0;j<A.length;j++)
	{
		if(A[j]<=i && i<=B[j])
		{
			if(gen[j]=='M')
			c1++;
			else
			c2++;		
		}
	}
	if(c1<=c2)
		count=c1;
	else
		count=c2;
	if(count>count1)
		count1=count;
}
System.out.println(count1);
}
}