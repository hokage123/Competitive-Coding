import java.util.*;
import java.io.*; 
class SummaryPower
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
int T,N,K,i,j,k,power,count[];
String S;
char[] ch,dh;
FastReader fr=new FastReader();
T=fr.nextInt();
count=new int[T];
for(i=0;i<T;i++)
{
power=0;
N=fr.nextInt();
K=fr.nextInt();
S=fr.next();
ch=S.toCharArray();
dh=new char[K];
for(k=0;k<K;k++)
dh[k]=ch[k];
for(j=1;j<(N-K+1);j++)
{
for(k=0;k<K;k++)
{
if(dh[k]!=ch[j+k])
{
power++;
dh[k]=ch[j+k];
}
}
}
count[i]=power;
}
for(i=0;i<T;i++)
System.out.println(count[i]);
}
}