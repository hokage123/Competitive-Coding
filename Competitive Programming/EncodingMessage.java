import java.util.*;
import java.io.*;
class EncodingMessage
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
int T,N,i,j,M;
String S;
char ch[],m;
ArrayList<String> ar=new ArrayList<>();
FastReader sc=new FastReader();
T=sc.nextInt();
for(i=0;i<T;i++)
{
N=sc.nextInt();
S=sc.next();
if(N%2==0)
M=N;
else
M=N-1;
ch=S.toCharArray();
for(j=0;j<M;)
{
m=ch[j];
ch[j]=ch[j+1];
ch[j+1]=m;
ch[j]=(char)('z'-ch[j]+'a');
ch[j+1]=(char)('z'-ch[j+1]+'a');
j=j+2;
}
if(N%2!=0)
ch[N-1]=(char)('z'-ch[N-1]+'a');
S=new String(ch);
ar.add(S);
}
for(String s:ar)
System.out.println(s);
}
}