import java.util.*;
import java.io.*;
class PUBGVSFORTNITE
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
int T,N,gamers[],i,count1,count2,j;
String ans[];
FastReader sc=new FastReader();
T=sc.nextInt();
ans=new String[T];
for(i=0;i<T;i++)
{
	count1=0;
count2=0;	
N=sc.nextInt();
gamers=new int[N];
for(j=0;j<N;j++)
gamers[j]=sc.nextInt();
for(j=0;j<N;j++)
{
if(gamers[j]==1)
count1++;
else
count2++;
}
if(count1>count2)
ans[i]="PUB-G";
else if(count1<count2)
ans[i]="Fortnite";
else
ans[i]="fifty-fifty";
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
}