import java.util.*;
import java.io.*;
class ChefAndTyping
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
public static void main(String[] d)throws IOException
{
int T,N,ans=0,ans1=0,i,j,k;
String s;
char ch='1',ip[];
FastReader sc=new FastReader();
HashMap<String,Integer> hm;
T=sc.nextInt();
BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
StringBuilder sb=new StringBuilder();
for(k=0;k<T;k++)
{
ans=0;	
hm=new HashMap<>();
N=sc.nextInt();	
for(i=0;i<N;i++)
{
ans1=0;	
s=sc.next();
ip=s.toCharArray();
j=0;
if(hm.containsKey(s))
	ans+=(hm.get(s))/2;
else
{	
while(j<ip.length)
{
if(j==0)
ans1+=2;
else if((ch=='d' || ch=='f') && (ip[j]=='d' || ip[j]=='f'))
ans1+=4;
else if((ch=='j' || ch=='k') && (ip[j]=='k' || ip[j]=='j'))
ans1+=4;
else
ans1+=2;
ch=ip[j];
j++;
}
hm.put(s,ans1);
}
ans+=ans1;
}
sb=sb.append(ans+"\n");
}
bw.write(sb.toString());
bw.close();
}
}