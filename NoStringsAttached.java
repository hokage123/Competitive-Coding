import java.io.*;
import java.util.*;
class NoStringsAttached
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
int T,i,j,k,y;
String S;
char ch[];
StringBuilder n=new StringBuilder();
FastReader sc=new FastReader();
BufferedWriter bf=new BufferedWriter(new OutputStreamWriter(System.out));
T=sc.nextInt();
for(i=0;i<T;i++)
{
S=sc.next();
ch=S.toCharArray();
y=0;
for(j=0;j<ch.length;j++)
{
for(k=(j+1);k<ch.length;k++)
{
if(ch[j]<ch[k])
y++;
}
}
n=n.append(y).append("\n");
}
bf.write(n.toString());
bf.close();
}
}