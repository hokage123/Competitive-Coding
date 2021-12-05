import java.util.*;
import java.io.*;
class SpellBob
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
public static void main(String[] p)
{
int T,count1,count2;
String s,s1,ans[];
char[] ch,ch1;
FastReader sc=new FastReader();
T=sc.nextInt();
for(i=0;i<T;i++)
{
count1=0;
count2=0;
s=sc.next();
s1=sc.next();
ch=s.ToCharArray();
ch1=s.ToCharArray();
for(j=0;j<3;j++)
{
if(ch[j]=='b' || ch1[j]=='b')
count1++;
else if(ch[j]=='o' || ch1[j]='o')
count2++;
}
if(count1==2 && count1==1)
ans[i]="Yes";
else
ans[i]="no";
}
for(i=0;i<T;i++)
System.out.println(ans[i]);
}
}