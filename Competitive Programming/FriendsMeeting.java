import java.util.*;
import java.io.*;
class FriendsMeeting
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
int T,N,i,j;
int[] a,ans;
String s,s1[];
FastReader sc=new FastReader();
T=sc.nextInt();
ans=new int[T];
for(i=0;i<T;i++)
{
ans[i]=-1;	
N=sc.nextInt();
a=new int[N];
s=sc.nextLine();
s1=s.split(" ");
for(j=0;j<a.length;j++)
{
a[j]=Integer.parseInt(s1[j]);
}
Arrays.sort(a);
//System.out.println(a[0]);
if(a[0]==1)
{
for(j=1;j<a.length;j++)
{
if(a[j]>1)
{
if(isPrime(a[j]))
{
ans[i]=a[j];
break;
}
}
}
}
}
for(i=0;i<T;i++)
System.out.println(ans[i]);	
}
static boolean isPrime(int r)
{
int j;
for(j=2;j<=Math.sqrt(r);j++)
{
if(r%j==0)
return false;
}
return true;
}
}