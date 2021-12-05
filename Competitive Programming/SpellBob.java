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
int T,count,i,j,k;
Integer m,n;
String s,s1,ans[];
char[] ch,ch1;
HashSet<Integer> bum;
HashSet<Integer> diggy;
FastReader sc=new FastReader();
T=sc.nextInt();
ans=new String[T];
for(i=0;i<T;i++)
{
count=0;	
ans[i]="no";	
 bum=new HashSet<>();
diggy=new HashSet<>(); 
s=sc.next();
s1=sc.next();
ch=s.toCharArray();
ch1=s1.toCharArray();
for(j=0;j<3;j++)
{
	if(ch[j]=='b')
		bum.add(j);
	if(ch1[j]=='b')
		bum.add(j);
	if(ch[j]=='o')
		diggy.add(j);
	if(ch1[j]=='o')
		diggy.add(j);
}
if((bum.size()==3 && diggy.size()>=1) || (bum.size()==2 && diggy.size()==3))
ans[i]="yes";
else if((bum.size()==2 && diggy.size()>=1))
{
if(!(bum.containsAll(diggy)))
ans[i]="yes";	
}	
}
for(i=0;i<T;i++)
{
	if(i!=(T-1))
	System.out.println(ans[i]);
	else
	System.out.print(ans[i]);	
}
}
}